//Use a stack to store all the characters
//if meets the left ones, such as ( { [, push into the stack
//if meets the right ones, pop the left ones and see if the two match

public class Solution {
    public boolean isValid(String s) {
      Boolean valid = false;
      Stack<Character> match = new Stack<Character>();
      
      if(s == null) return true;
      
      for(int i=0; i<s.length(); i++){
        if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
          match.push(s.charAt(i));
        }
        
        if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
          if(match.size == 0) return false;  //no left matches won't work..
          else{
            Character lefty = match.pop();  //pop the one that needs to be matched
            Character righty = s.charAt(i);
            
            if(lefty == '('){
              if(righty == ')') valid = true;
              else valid = false;
            }
            if(lefty == '['){
              if(righty == ']') valid = true;
              else valid = false;
            }
            if(lefty == '{'){
              if(righty == '}') valid = true;
              else valid = false;
            }
          }
        }
        if (match.size != 0) return valid = false;
      }
      return valid;
    }
}
