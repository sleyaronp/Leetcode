public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <2) return nums.length;

        int index = 1;
        int i = 0;
        for(i=0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1])
            {
                 //move the next one that does not equal to the previous duplicate one position
                 nums[index] = nums[i+1];
                 index ++;
             }
        }
        return index;
    }
}
