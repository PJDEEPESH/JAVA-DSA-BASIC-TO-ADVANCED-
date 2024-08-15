

        class Solution {
            public boolean findRotation(int[][] mat, int[][] target) {
                        for (int i=0 ; i<4 ; i++) {
                                if ( same( mat , target ) ) {
                                        return true;
                                }
                                mat = rotate(mat);
                        }
                        return false;
                }
         
                private boolean same(int[][] mat, int[][] target) {
                        for(int i = 0;i<mat.length;i++)
                        {
                            for(int j = 0;j<mat[i].length;j++)
                            {
                                if(mat[i][j] != target[i][j])
                                {
                                    return false;
                                }
                            }
                        }
                        return true;
                }
         
                private int[][] rotate(int[][] mat) {
                        int n = mat.length;
                        int m = mat[0].length;
                        int b[][] = new int[m][n];
                        for(int i=0 ; i<n ; i++) {
                                for(int j=0 ; j<m ; j++) {
                                        b[j][n-i-1] = mat[i][j];
                                }
                        }
                        return b;
                }
         
        }

