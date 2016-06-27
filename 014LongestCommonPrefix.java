public class Solution {
  public String longestCommonPrefix(String[] strs) {
    if(strs.length == 0) return null;
    
    String prefix = strs[0];
    for(int i=1; i<strs.length; i++){
      while(strs[i].indexof(prefix) != 0){
        prefix = prefix.substring(0, prefix.length()-1);
        if(prefix.isEmpty()) return "";
      }
    }
    return prefix;
  }
}

/* ------------------------------------------------------------------------------------------ */
public class Solution {
  public String longestCommonPrefix(String[] strs) {
    if(strs.length == 0) return null;
    
    String prefix = strs[0];
    for(int i=0; i<strs.length; i++){
      int j = 0;
      while(j<prefix.length() && j<strs[i].length() && prefix.charAt(j) == strs[j].charAt(j){
        j++;
      }
      if(j == 0){
        return "";
      }
      prefix = prefix.substring(0,j); 
    }
    return prefix;
  }
}
