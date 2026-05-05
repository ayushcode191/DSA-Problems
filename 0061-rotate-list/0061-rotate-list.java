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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        // Step 1: Find the length of the list
        ListNode c = head;
        int n = 0;
        while (c != null) {
            n++;
            c = c.next;
        }

        // Reduce k to be within the length of the list
        k = k % n;
        if (k == 0) {
            return head; // No rotation needed
        }

        // Step 2: Find the (n - k)-th node
        ListNode first = head;
        ListNode temp = head;
        for (int i = 1; i < n - k; i++) {
            temp = temp.next;
        }

        // Step 3: Perform the rotation
        ListNode newHead = temp.next;
        temp.next = null;
        ListNode last = newHead;
        while (last.next != null) {
            last = last.next;
        }
        last.next = head;

        return newHead;
        


    }
}