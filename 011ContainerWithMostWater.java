public class Solution {
    public int maxArea(int[] height) {
      if(height == null) return 0;
      
      int maxarea = 0;
      int left = 0;
      int right = height.length - 1;
      
      
      while(left < right){
         maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * (right - left));
         //shorter height determines the volumn;
         
         //moving the shorter in order to find a potential higher height which leads to larger volumn;
         if(height[left] < height[right]) left++;
         else right--;
      }
      
      return maxarea;
    }
}
