public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length < 2) return false;
        
        boolean duplicate = false;
        HashSet set = new HashSet();
        
        for(int i=0; i<nums.length; i++){
            if(!set.add(nums[i])) return true; 
            //set does contain duplicates, so if does not add meaning there is the same
        }
    
        return false;
    }
    
    /*
    起初使用的HashMap，一个for循环，将i与数组中的值nums[i]，作为键值对
    进行存储，如果不重复，存入，如果重复直接返回true。但是在leetcode的
    OJ编译时，出现了time limited限制。
    随后，查阅资料，此处应该使用HashSet，因为HashMap存储时是对键值对进
    行存储，如果用一个无穷，不重复的数组进行判断，复杂度与时间消耗是很
    多的。
    而HashSet的好处在于：HashSet实现了Set接口，它不允许集合中有重复的值，
    在进行存储时，先进行判断，使用contain方法即可，复杂度与时间消耗就随之降下来了。
    */
}
