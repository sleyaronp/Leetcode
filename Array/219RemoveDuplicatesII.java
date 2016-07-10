public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(!set.add(nums[i])) return true;
            if (set.size() > k) {
               set.remove(nums[i-k]);  //remove the previous checked elements
            }
        }
        
        return false;
    }
}
