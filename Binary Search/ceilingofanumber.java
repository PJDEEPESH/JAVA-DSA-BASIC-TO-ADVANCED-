class ceilingofanumber
{
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int start = 0;
        int end = arr.length - 1;
        int target = 3;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
            {
                System.out.println(arr[mid]);
            }
            else if(arr[mid] > target)
            {
                end = mid - 1; 
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
        }
        System.out.println(arr[start]);
    }
} 
