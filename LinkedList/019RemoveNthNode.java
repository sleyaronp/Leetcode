Given a linked list, remove the nth node from the end of list and return its head.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n){
      if(head == null) return null;
      
      //Calculate the length of head
      int length = 0;
      while(p != null){
        p = p.next;
        length++;
      }
      
      //if remove the first element
      if(length-n == 0){
        return head.next;
      }
      
      ListNode p = head;
      int i = 0;
      while(p != null){
        i++;
        if(i == length - n){
          p.next = p.next.next;  //current next point to the next next
        }
        p = p.next;
      }
      return head;
    }
}
