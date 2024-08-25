class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;
        
        // Count the number of chips on even and odd positions
        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        // The minimum cost is the smaller of the two counts
        return Math.min(evenCount, oddCount);
    }
}
