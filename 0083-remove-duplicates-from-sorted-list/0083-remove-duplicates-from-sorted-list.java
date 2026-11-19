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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode curr = head;
        ListNode temp = curr.next;
        while(temp != null)
        {
            if(curr.val != temp.val)
            {
                curr = temp;
                temp  = temp.next;
            }
            else{
                while(temp != null && temp.val == curr.val)
                {
                    temp = temp.next;
                }
                curr.next = temp;
                curr = temp;
                if(temp != null)
                    temp = temp.next;
                
            }
        }
        return head;
    }
}