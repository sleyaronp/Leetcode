public class Solution {
  //to steps n, either from steps(n-1) plus 1 step or steps(n-2) plus 2 steps, thus
  // steps(n) = steps(n-1) + steps(n-2), which representing the number of ways of getting to n-1, n-2 separately
   public int climbStairs(int n) {
    if(n<3) return n;
    
    int[] steps = new int[n+1]; //0 to n
    steps[0] = 0;
    steps[1] = 1;
    steps[2] = 2;
    
    for(int i=3; i<=n; i++){
      steps[n] = steps[n-1] + steps[n-1];
    }
    
    return steps[n];
   }
}
