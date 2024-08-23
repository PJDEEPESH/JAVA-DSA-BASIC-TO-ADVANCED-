class searchinrange 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,3,5,35,36,36,454,452,4,8};
        int start = 2;
        int end = 5;
        int target = 35;

        System.out.println(searchin(arr,start,end,target));
    }   
    static boolean searchin(int[] arr,int start,int end,int target)
    {
        if(end - start == 0)
        {
            return false;
        }
        for(int c : arr)
        {
            if(c == target)
            {
                return true;
            }
        }
        return false;
    } 
}
