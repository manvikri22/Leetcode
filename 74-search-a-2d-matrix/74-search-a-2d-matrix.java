class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length ==0) return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int i = 0;
        int j = n-1;
        
        while (i < m && j >= 0)
        {
            if (matrix[i][j] == target)
            {
                return true;
            }
            if (matrix[i][j] > target)
                j--;
            else 
                i++;
        }
        
        
        
        /**while(l<=h)
        {
            int mid = (l + (h-l)/2);
            if(matrix[mid/m][mid%m]==target) return true;
            if(matrix[mid/m][mid%m]<target) 
            {
                l = mid+1;
            }
            else
            {
                h = mid-1;
            }
        }**/
        return false;
    }
}