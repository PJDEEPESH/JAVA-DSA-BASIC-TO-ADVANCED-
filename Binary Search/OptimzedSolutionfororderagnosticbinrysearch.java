class orderagnosticbinarysearchopti 
{
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 8;
        System.out.println(binarysearch(arr,target));
    }    
    static int binarysearch(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
            {
                return mid;
            }
            if(isAsc)
            {
                if(arr[mid] < target)
                {
                    start = mid + 1;
                }
                else if(arr[mid] > target)
                {
                    end = mid - 1;
                }
            }
            else
            {
                if(arr[mid] > target)
                {
                    start = mid + 1;
                }
                else if(arr[mid] < target)
                {
                    end = mid - 1;
                }
            }
        }
        return -1;
        
    }
    
}
