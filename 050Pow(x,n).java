public class Solution {
    public double myPow(double x, int n) {
      if(n == 0) return 1;
      if(n == 1) return x;
      if(n < 0) return 1 / power(x, -n);
      
      return power(x,n);
    }
    
    //recursive
    private double power(double x, int n){
      if(n == 0) return 1.0f;
      if(n == 1) return x;
      
      double y = power(x, 2/n);
      if(x%2 == 0) return y*y; //even power
      if(x%2 == 1) return y*y*x; //odd power
    }
  }
