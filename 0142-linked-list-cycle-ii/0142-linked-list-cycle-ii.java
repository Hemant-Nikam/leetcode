/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int a = 0  , c = 0;

        ListNode fast = head , slow = head;
        while(fast != null && fast.next != null )
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                break;
            }

        }
        if(fast == null || fast.next == null)
            return null;
        ListNode curr = head;
        while(curr != slow)
        {
            curr = curr.next;
            slow = slow.next;
        }
        return curr;
    }
}