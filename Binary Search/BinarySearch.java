class Binarysearch 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 2;
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int mid = start + (end - start ) / 2;

            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target < arr[mid])
            {
                end = mid - 1;
            }
            if(arr[mid] == target)
            {
                System.out.println(mid);
                return;
            }
        }
        System.out.print("Not Found");

    }
}
