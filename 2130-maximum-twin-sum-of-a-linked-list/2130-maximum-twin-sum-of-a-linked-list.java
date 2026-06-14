/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = reverse(slow);

        ListNode first = head;
        ListNode second = prev.next;
        int sum = 0;
        while(second!=null){
            sum = Math.max(sum,first.val+second.val);
            first = first.next;
            second = second.next;
        }
        return sum;

    }
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}