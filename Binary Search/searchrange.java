class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int start = 0;
        int end = nums.length - 1;
        int[] ans = {-1, -1};

        // Find the first occurrence
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
            {
                ans[0] = mid;
                end = mid - 1; // Continue searching in the left half
            }
            else if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }

        // Reset start and end for finding the last occurrence
        start = 0;
        end = nums.length - 1;

        // Find the last occurrence
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
            {
                ans[1] = mid;
                start = mid + 1; // Continue searching in the right half
            }
            else if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }

        return ans;
    }
}
