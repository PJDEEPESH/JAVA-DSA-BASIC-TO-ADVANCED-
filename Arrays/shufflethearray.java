class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] newarray = new int[nums.length];
        for(int i  = 0 ; i<n;i++)
        {
            array1[i] = nums[i];
        }
        
        for(int j = 0 ;j<n;j++)
        {
           array2[j] = nums[n + j];
        }
        for(int i = 0;i<n;i++)
        {
            newarray[2 * i] = array1[i];
            newarray[2 * i + 1] = array2[i];
        }
        
        return (newarray);
    }

}
