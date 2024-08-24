class twodmin 
{
    public static void main(String[] args) 
    {
        int[][] arr = {{1,2,3},{4,0,6},{7,8,9}};
        int min = arr[0][0];
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ;j < arr[i].length ;j++)
            {
                min = Math.min(min,arr[i][j]);
            }
        }
        System.out.println(min);
    }    
}
