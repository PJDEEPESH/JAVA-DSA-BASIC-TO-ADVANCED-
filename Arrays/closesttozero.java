class Solution 
{
    public int findClosestNumber(int[] nums)
    {
        int min = Integer.MAX_VALUE;  
        
        for(int i = 0; i < nums.length; i++)
        {
            int distance = Math.abs(nums[i]) - 0;
            
            if (distance < Math.abs(min) || (distance == Math.abs(min) && nums[i] > min))
            {
                min = nums[i];
            }
        }         
        return min;
    }
}
