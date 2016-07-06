public class Solution {
  public void moveZeroes(int[] nums) {
    if(nums == null || nums.length == 0) return;
        
    int j = 0; //to exchange
    for(int i=0; i<nums.length; i++){
      if(nums[i] != 0){//i for mark nonzeros
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        j++; //only increment after finishing a swap
      }
    }
  }
}
