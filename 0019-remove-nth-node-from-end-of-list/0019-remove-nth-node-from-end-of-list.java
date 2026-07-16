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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //solve this problms by two pointer methods (not in this solution)
        ListNode temp = head;
        ListNode curr = null;
        int cnt = 0;
        while(temp != null){
            if(cnt == n){
                curr =head;
            }
            temp = temp.next;
            if(cnt > n ){
                curr = curr.next;
            }
            cnt++;
        }
        if(curr == null){
            head = head.next;
            return head;
        }else if(n == cnt -1 && n == 1){
            head.next = null;
            return head;
        }
        curr.next = curr.next.next;
        return head;
    }
}