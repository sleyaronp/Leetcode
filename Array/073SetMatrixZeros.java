//Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
//Do it in space means does not require extra space to finish it

//Step 1, mark the 1st non-zero place in the first row and first column
//Step 2, set the row and column containing the non-zero element to zero
//Step 3, set the crossing point in step 2 to zero
//Step 4, clear the first row and first column

public class Solution {
    public void setZeroes(int[][] matrix) {
      boolean firstrowzero = false;
      boolean firstcolumnzero = false;
      
      //first none zero column
      for(int i=0; i<matrix.length; i++){
        if(matrix[i][0] == 0){
          firstcolumnzero = true;
          break;
        }
      }
      //first none zero row
      for(int i=0; i<matrix[0].length; i++){
        if(matrix[0][i] == 0){
          firstrowzero = true;
          break;
        }
      }
      
      //set the rows and columns containing zero to zero
      for(int i=1; i<matrix.length; i++){
        for(int j=1; j<matrix[0].length; j++){
          if(matrix[i][j] == 0){
             matrix[i][0] = 0;
             matrix[0][j] = 0;
          }
        }
      }  
     
     //cross point 
      for(int i=1; i<matrix.length; i++){
        for(int j=1; j<matrix[0].length; j++){
          if(matrix[i][0] == 0 || matrix[0][j] == 0){
            matrix[i][j] = 0;}
        }
      }
      
      //clear the first row and first column
      if(firstrowzero){
        for(int i=0; i<matrix[0].length; i++){
          matrix[0][i] = 0;
        }
      }
      if(firstcolumnzero){
        for(int i=0; i<matrix.length; i++){
          matrix[i][0] = 0;
        }
      }
      
      }
    }
