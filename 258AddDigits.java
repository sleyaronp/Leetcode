public class Solution {
  public int addDigits(int num) {
    if(num == 0) return 0;
    int sum = num;
        
    while(num >= 10){
      sum = (num/10) + (num%10);
      num = sum;
    }
        
    return sum;
  }
}

/* ----------- no loop version --------------- */
public class Solution {
  public int addDigits(int num) {
    if(num < 10) return num;
    else if(num % 9 == 0) return 9;
    else return (num%9);
  }
}
