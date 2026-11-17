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

    public ListNode findMiddle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null)
            return true;

        ListNode curr = head;
        ListNode middle = findMiddle(curr); //end of 1st list

        ListNode secondList = reverseList(middle.next); //second list starting
        curr = head;
        while(secondList != null)
        {
            if(secondList.val != curr.val)
                return false;
            secondList = secondList.next;
            curr = curr.next;
        }
        return true;
    }
}