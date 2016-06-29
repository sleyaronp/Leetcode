/*
Given a linked list, swap every two adjacent nodes and return its head.
Given 1->2->3->4, you should return the list as 2->1->4->3.
*/


public class Solution {
    public ListNode swapPairs(ListNode head) {
      ListNode dummy = new ListNode(0);
      dummy.next = head; //add a head to the head
      ListNode p = head;
      ListNode prev = dummy;
      
      // prev -> p -> q -> r
      while(p != null && p.next != null){  
        ListNode q = p.next, r = p.next.next;
        prev.next = q;
        q.next = p;
        p.next = r;
        //switch to the next pair
        prev = p;
        p = r;
      }
      return dummy.next;
  }
}
