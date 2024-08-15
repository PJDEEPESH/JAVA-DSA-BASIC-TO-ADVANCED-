class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<matrix.length;i++)
          {
            for(int j = 0 ;j<matrix[i].length;j++)
              {
                  int element = matrix[i][j];
                  int min = matrix[i][j];
                  int max = matrix[i][j];
                  for(int k = 0;k<matrix[i].length;k++)
                    {
                      min = Math.min(min,matrix[i][k]);
                    }
                  for(int l =0 ;l<matrix.length;l++)
                    {
                      max = Math.max(max,matrix[l][j]);
                    }
                if(min == element && max == element)
                {
                  ans.add(element);
                }
              }
          }
      return ans;
    }
}
