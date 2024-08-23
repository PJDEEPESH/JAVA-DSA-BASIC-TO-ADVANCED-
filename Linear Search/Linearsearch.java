class linearsearch 
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,43,24,34,253,234,234};
        int target = 3;
       int ans = linearsearch(arr,target);
       System.out.println(ans);
    }
    static int linearsearch(int[] arr,int target)
    {
        if(arr.length == 0 )
        {
            return -1;
        }
        for(int i = 0 ;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
