public class Solution {
//recursive
     public boolean hasCycle(ListNode head) {
         if(head == null || head.next == null) return false;
        
         if(head == head.next) return true;
        
         ListNode next = head.next;
         head.next = head;
         boolean cycle = hasCycle(next);
         return cycle;
        
     }
    
//Two pointers
//检测linked list是否有环：用双指针追击法：
//快指针fast一次走两步，慢指针slow一次走一步。如果有环，两指针必定在某一时间相遇。
//fast不会跳过slow。因为如果fast跳过slow，那么前一步它们必已经相遇。

    public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) 
			return false;
			
		ListNode p = head;
		ListNode q = head;
		
		while(q != null && q.next != null) {
			p = p.next;
			q = q.next.next;
			if (p == q)
				return true;
		}
		
		return false;
	}
}
