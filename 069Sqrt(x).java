public class Solution {
    //Binary search
    public int mySqrt(int x) {
      if(x<=1) return x;
      int l = 1, r = x;
      
      while(l<=r){ //break out when l == r, then result don't need to minus 1
        int mid = (l + r)/2;
        if(mid < x/mid){
          l = mid + 1; 
        }else if(mid > x/mid){
          r = mid - 1;
        }else if( mid == x/mid){
          return mid;
        }
      }
        return r;
    }
  }
