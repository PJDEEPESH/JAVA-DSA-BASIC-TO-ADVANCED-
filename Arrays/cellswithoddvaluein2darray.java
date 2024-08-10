class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] result = new int[m][n]; // Initialize the matrix with zeros
        int count = 0;
        
        // Apply the operations based on indices
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0]; // Get the row index
            int col = indices[i][1]; // Get the column index
            
            // Increment all elements in the row `row`
            for (int j = 0; j < n; j++) {
                result[row][j]++;
            }
            
            // Increment all elements in the column `col`
            for (int j = 0; j < m; j++) {
                result[j][col]++;
            }
        }
        
        // Count the number of odd values in the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (result[i][j] % 2 != 0) { // Check if the value is odd
                    count++;
                }
            }
        }
        
        return count; // Return the count of odd cells
    }
}
