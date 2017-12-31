/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode prev = null;
        ListNode after = head.next;

        while(after != null) {
        	head.next = prev;
        	prev = head;
        	head = after;
        	after = after.next;
        }
        head.next = prev;
        return head;
    }
}