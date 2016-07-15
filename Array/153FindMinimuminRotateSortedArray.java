public class Solution {
    public int findMin(int[] nums) {
       int left = 0, right = nums.length - 1; 
       
       while(nums[left] > nums[right]){
           int middle = left + (right - left) / 2;
           if(nums[middle] >= nums[left]) {
               left = middle + 1;
           }else {
               right = middle;
           }
       }
    
       return nums[left];
    }
}
