public class Solution {
    public int maxSubArray(int[] nums) {
      if(nums.length == 0 || nums == null) return 0;
      
      int sum = 0;
      int max = Integer.MAX_VALUE;
      
      for(int i=0; i<nums.length; i++){
        sum = Math.max(nums[i], sum+nums[i]);
        max = Math.max(sum, max);
      }
      
      return max;
    }
  }
