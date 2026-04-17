class LRUCache {
    class Node{
        int key;
        int value;
        Node next;
        Node prev;
        Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    int capacity;
    HashMap<Integer,Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }

    void addNode(Node newNode) {
        Node temp = head.next;
        newNode.next = temp;
        newNode.prev = head;
        head.next = newNode;
        temp.prev = newNode;
    }
    void deleteNode(Node delNode) {
        Node delPrev = delNode.prev;
        Node delNext = delNode.next;
        delPrev.next = delNext;
        delNext.prev = delPrev;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node resN = map.get(key);
            int value = resN.value;
            map.remove(key);
            deleteNode(resN);
            addNode(resN);
            map.put(key,head.next);
            return value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node existingN = map.get(key);
            map.remove(key);
            deleteNode(existingN);
        }
        if(map.size() == capacity){
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        addNode(new Node(key, value));
        map.put(key, head.next);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */