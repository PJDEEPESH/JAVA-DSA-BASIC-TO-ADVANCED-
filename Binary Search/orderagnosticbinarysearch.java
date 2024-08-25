class orderagnosticbinarysearch 
{
    public static void main(String[] args)
    {
        // int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int start = 0;
        int target = 8;
        int end = arr.length-1;
        if(arr[start]<arr[end])
        {
            System.out.println(binarysearch(arr,start,end,target));
        }    
        else if(arr[start] > arr[end])
        {
            System.out.println(orderagnosticbinarysearch(arr,start,end,target));
        }
    }
    static int binarysearch(int[] arr,int start,int end,int target)
    {
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target < arr[mid])
            {
                end = mid - 1;
            }
        }
        return -1;
    }
    static int orderagnosticbinarysearch(int[] arr,int start,int end,int target)
    {
       
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target == arr[mid])
            {
                return mid;
            }
            else if(target > arr[mid])
            {
                end = mid - 1;
            }
            else if(target < arr[mid])
            {
                start = mid + 1;
            }
        }
        return -1;
        
}
}
