class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int originalRows = mat.length;
        int originalCols = mat[0].length;
        
        // Check if reshaping is possible
        if (originalRows * originalCols != r * c) {
            return mat;  // If reshaping isn't possible, return the original matrix
        }
        
        int[][] reshapedMatrix = new int[r][c];
        int row = 0, col = 0;
        
        // Traverse through the original matrix
        for (int i = 0; i < originalRows; i++) {
            for (int j = 0; j < originalCols; j++) {
                reshapedMatrix[row][col] = mat[i][j];
                col++;
                // Move to the next row if the current row is filled
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        
        return reshapedMatrix;
    }
}
