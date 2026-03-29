class EventManager {
    PriorityQueue<int[]> pq;
    int[][] events;
    Map<Integer,Integer> map = new HashMap<>();
    public EventManager(int[][] events) {
        pq = new PriorityQueue<>((a,b) -> {
            if(a[1]==b[1]) return a[0]-b[0];
            return b[1]-a[1];
        });
        this.events = events;
        for(int[] event : events){
            map.put(event[0],event[1]);
            pq.add(new int[]{event[0],event[1]});
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId,newPriority);
        pq.add(new int[]{eventId,newPriority});
    }
    
    public int pollHighest() {
        while(!pq.isEmpty()){
            int[] top = pq.poll();
            int eId = top[0];
            int pr = top[1];
            if(!map.containsKey(eId)) continue;
            if(map.get(eId)!=pr){
                continue;
            }
            map.remove(eId);
            return eId;
        }
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */