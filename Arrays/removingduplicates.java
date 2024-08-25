class Solution {
    public int removeDuplicates(int[] nums) {
       // Handle empty array case
        
        int uniqueIndex = 0;  // Index to place the next unique element
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;  // Move to the next position
                nums[uniqueIndex] = nums[i];  // Place the unique element in the correct position
            }
        }
        
        return uniqueIndex + 1;  // Number of unique elements
    }
}
