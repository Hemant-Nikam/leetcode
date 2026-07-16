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
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = curr.next;

        while(curr != null && nxt != null){
            ListNode temp = nxt.next;
            nxt.next = curr;
            curr.next = temp;
            if(prev != null)
                prev.next = nxt;
            else
                head = nxt;

            prev = curr;
            curr = temp;
            if(curr != null)
                nxt = curr.next;
       
        }
        return head;
    }

    
}