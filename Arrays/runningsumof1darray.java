class Solution 
{
    public int[] runningSum(int[] nums) 
    {
        int[] sum = new int[nums.length];
        int sums = 0;
        for(int i = 0;i<nums.length;i++)
        {
            sum[i] = sums + nums[i];
            sums += nums[i];

        }
        return (sum);
    }
}
