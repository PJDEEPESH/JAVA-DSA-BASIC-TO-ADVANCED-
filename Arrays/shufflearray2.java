class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newarray = new int[nums.length];
        for(int i = 0;i<n;i++)
        {
            newarray[2*i] = nums[i];
            newarray[2*i+1] = nums[n + i];
        }
        return (newarray);
    }

}
