public class Solution {
  public boolean exist(char[][] board, String word) {
    int row = board.length;
    int col = board[0].length;
    boolean exists = false;
        
    if(board == null || word == null || row == 0 || col == 0) return false;
        
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        if(helper(board, word, i, j, 0)) {return true;} //DFS all the elements 
        }
      }
      return exists;
    }
    
  public boolean helper(char[][] board, String word, int i, int j, int k){
    int row = board.length;
    int col = board[0].length;
        
    if(i<0 || i>=row || j<0 || j>=col) return false;
        
    if(board[i][j] == word.charAt(k)){ //find the first match
      board[i][j] = '#'; //mark the visited one with #
           
        if(k == word.length()-1) return true;
           
        else if(  //search the adjacent places
          helper(board, word, i-1, j, k+1) || //move left
          helper(board, word, i, j-1, k+1) || //move up
          helper(board, word, i+1, j, k+1) || //move right
          helper(board, word, i, j+1, k+1) //move down
          ){ return true; }
           
          board[i][j] = word.charAt(k);  //backtracking
        }  
        return false;
    }
}
