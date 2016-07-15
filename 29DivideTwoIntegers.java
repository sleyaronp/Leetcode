//Divide two integers without using multiplication, division and mod operator.

//Binary Search
public int divide(int dividend, int divisor) {
        //Use long to avoid integer overflow cases.
        int sign = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) sign = -1;
        long abdividend = Math.abs((long) dividend);
        long abdivisor = Math.abs((long) divisor);
        
        if(abdivisor == 0) return Integer.MAX_VALUE;
        if((abdividend == 0) || (abdividend < abdivisor)) return 0;
        
        long lresult = ldivide(abdividend, abdivisor);
        
        int result;
        if(lresult > Integer.MAX_VALUE) {
            result = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }else{
            result = (int) (sign*lresult);
        }
        
        return result;
    }
    
    public long ldivide(long ldividend, long ldivisor){
        if(ldividend < ldivisor) return 0;
        
      //  Find the largest multiple so that (divisor * multiple <= dividend), 
	    //  whereas we are moving with stride 1, 2, 4, 8, 16...2^n for performance reason.
	    //  Think this as a binary search.
        long sum = ldivisor;
        long multiple = 1; 
        while( (sum + sum) <= ldividend){
            sum += sum;
            multiple += multiple;
        }
        
        return multiple + ldivide(ldividend - sum, ldivisor);
    }

//Bit Manipulation
 public int divide(int dividend, int divisor) {
        //Use long to avoid integer overflow cases.
        int sign = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) sign = -1;
        long abdividend = Math.abs((long) dividend);
        long abdivisor = Math.abs((long) divisor);
        
        if(abdivisor == 0) return Integer.MAX_VALUE;
        if((abdividend == 0) || (abdividend < abdivisor)) return 0;
        
        long lresult = 0;
        while(abdividend >= abdivisor){
            long temp = abdivisor, count = 1;
            while(temp <= abdividend){
                temp = temp << 1;  //left shift 1 digit is to multiply by 2
                count = count << 1;
            }
            temp = temp >> 1; //
            count = count >> 1;
            lresult += count; 
            abdividend -= temp;
        }
        
        int result;
        if(lresult > Integer.MAX_VALUE) {
            result = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }else{
            result = (int) (sign*lresult);
        }
        
        return result;
    }
