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
    public ListNode reverseList(ListNode head) {
        ListNode reverse = null;

        ListNode iterator = head;
        while(iterator != null){
            ListNode next = iterator.next;
            iterator.next = reverse;
            reverse = iterator;
            iterator = next;

        }
        return reverse;

    }
}
