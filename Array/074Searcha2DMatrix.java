//transfer the 2D matrix into a linear search
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int left = 0, right = rows * cols - 1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            int midval = matrix[mid/cols][mid%cols];
            if(midval == target) return true;
            else if(midval < target) left = mid + 1;
            else right = mid - 1;
        }
        
        return false;
    }
}

//use binary search twice
//first for the row then for the col
public class Solution{
   public boolean searchMatrix(int[][] matrix, int target) {  
        if(matrix == null || matrix.length==0 || matrix[0].length==0)  
            return false;  
        int low = 0;  
        int high = matrix.length-1;  
        while(low<=high){  
            int mid = (low+high)/2;  
            if(matrix[mid][0] == target)
                return true;  
            else if(matrix[mid][0] > target)  
                high = mid-1; 
            else
                low = mid+1;  
        }
        
        int row = high; //当从while中跳出时，low指向的值肯定比target大，而high指向的值肯定比target小
        
        if(row<0)  
            return false; 
            
        low = 0;  
        high = matrix[0].length-1;  
        while(low<=high){  
            int mid = (low+high)/2;  
            if(matrix[row][mid] == target)
                return true;  
            else if(matrix[row][mid] > target)  
                high = mid-1;
            else 
                low = mid+1;  
        }     
        return false;  
    }
}
