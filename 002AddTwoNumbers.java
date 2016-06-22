/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int carry = 0;
       ListNode temp = new ListNode(0);
       ListNode p1 = l1, p2 = l2, p3 = temp; //p1 for 1st number, p2 for 2nd number, p3 to store the result;
       //retrieve one digit at a time, from the unit level to the top level
       
      while(p1 != null || p2 != null){
      if(p1 != null){
        carry += p1.val;
        p1 = p1.next;
      }
      if(p2 != null){
        carry += p2.val;
        p2 = p2.next;
      }
      
      p3.next = new ListNode(carry%10); //store the unit digit, use the 
      p3 = p3.next;
      carry /= 10; //store the carry and do the next round caculation
      }
      
      if(carry != 0)
      p3.next = new ListNode(1); //add a new digit;
      
      return temp.next;
    }
 }
