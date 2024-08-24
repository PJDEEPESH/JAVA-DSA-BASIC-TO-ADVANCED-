class twodmax 
{
    public static void main(String[] args) 
    {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int max = arr[0][0];
        for(int i = 0 ;i < arr.length;i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                max = Math.max(max,arr[i][j]);
            }
        }
        System.out.println(max);
    }    
}
