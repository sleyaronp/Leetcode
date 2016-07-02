//Same as remove duplicates from sorted array
//duplicates allow at most twice for each element

public class Solution {
    public int removeDuplicates(int[] nums) {
      if(nums.length<2) return nums.length;
      
      int count = 0;
      int i = 0;
      int index = 1;
      
      for(i=0; i<nums.length-1; i++){
        if(nums[i] == nums[i+1]){
          count++;
            if(count <= 1){ //==2, then does not move
              nums[index] = nums[i+1];
              index++;
            }
        }else{
          nums[index] = nums[i+1];
          count = 0;
          index++;
        }  
      }
      
      return index;
  }
}
