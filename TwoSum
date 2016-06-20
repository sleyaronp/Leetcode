public class Solution {
   public int[] twoSum(int[] numbers, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      int[] result = new int[2];
      
      for(int i=0; i<numbers.length; i++){
         if(map.containsKey(numbers[i])){ 
            int index = map.get(numbers[i]);
            result[0] = index;
            result[1] = i;
            break;
        }else{  //if not contains, enter the value into the map
            map.put(target - numbers[i], i); //store the difference value for the future check
        }
      }
      return result;
   }
}
