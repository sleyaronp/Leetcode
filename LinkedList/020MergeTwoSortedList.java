public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode newlist = new ListNode(0);
      ListNode p = newlist;
      
      while(l1 != null && l2 != null){
        if(l1.val < l2.val){
          p.next = l1;
          l1 = l1.next;
        }
        else{
          p.next = l2;
          l2 = l2.next;
        }
        p = p.next;
      }
      
      //if one of the list is empty
      if(l1 != null){
        p.next = l1;
      }
      if(l2 != null){
        p.next = l2;
      }
      
    }
    return newlist.next;
}
