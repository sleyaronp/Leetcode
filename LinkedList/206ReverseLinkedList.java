public class Solution {
//iterative
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode prev = null;
        // prev -> head
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    
//recursive
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode second = head.next;
        head.next = null;
        
        ListNode next = reverseList(second);
        second.next = head;
        
        return next;
        
    }
}
