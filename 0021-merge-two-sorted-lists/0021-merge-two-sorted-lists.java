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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode temp = list1;
        if(list1 == null && list2 == null){
            return list1;
        }
        else if(list1 == null){
            return list2;
        }
        else if(list2 == null){
            return list1;
        }
        ListNode head = list1.val <= list2.val ? list1:list2;
        ListNode temp = list1.val <= list2.val ? list2:list1;
        list1 = head;
        list2 = temp;
        
        while(list1 != null  && list2 != null){
            if(list1.next != null && list1.val <= list2.val && list1.next.val >=list2.val ){
                    ListNode t = list1;
                    list1 = list2;
                    list2 = t.next;
                    t.next = list1;
            }
            else if(list1.next != null && list1.val <= list2.val && list1.next.val <list2.val){
                    list1 = list1.next;
            }
            else if(list1.next == null ){
                list1.next = list2;
                list1 = null;

            }


        }
        
        return head;
    }
}