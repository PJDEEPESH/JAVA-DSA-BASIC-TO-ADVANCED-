class floorofanumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        int start = 0;
        int end = arr.length - 1;
        int target = 13;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
            {
                System.out.print(arr[mid]);
                return;
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
        System.out.println(arr[end]);
    }
}
