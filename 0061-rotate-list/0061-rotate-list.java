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
        if(head == null || head.next == null || k == 0)
            return head;
        int size = 1;

        ListNode curr = head;
        ListNode st = head;

        while(curr.next != null)
        {
            curr = curr.next;
            size++;
        }
        k = size - k % size ;
        if(k == size)
            return head;
        int cnt = 1;
        curr = head;
        while(cnt < k )
        {
            curr = curr.next;
            cnt ++ ;
        }
        head = curr.next;
        curr.next = null;
        curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = st;
        return head;
    }
}