class twodsearching 
{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 99;
        System.out.println(found(arr,target));
    }    
    static boolean found(int[][] arr,int target)
    {
        for(int i = 0 ; i<arr.length ; i++)
        {
            for(int j = 0 ; j<arr[i].length;j++)
            {
                if(arr[i][j] == target)
                {
                    return true;
                }
            }
            
        }
        return false;
    }
}
