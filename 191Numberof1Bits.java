public class Solution {
    // you need to treat n as an unsigned value
    //& n and n-1 until 0
    public int hammingWeight(int n) {
        if(n == 0) return 0;
        
        int count = 0;
        while(n != 0){
            n &= (n-1);
            count++;
        }
        
        return count;
    }
    
    //left shift and check whether the last digit is 1
      public int hammingWeight(int n) {
        if(n == 0) return 0;
        
        int count = 0;
        while(n!=0){
            count = count + (n & 1);
            n = n >>> 1; // >>> for always shifting in a "0" regardless of the sign
        }
        return count;
      }
}
