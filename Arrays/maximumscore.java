class Solution {

    public long maxPoints(int[][] points) {

        // 'n' denotes the length of columns in 'points'

        int n = points[0].length;

      

        // 'currentRowMaxPoints' stores the maximum points achievable for the current row

        long[] currentRowMaxPoints = new long[n];

      

        // 'infinity' is a large number to be considered as negative infinity

        final long infinity = 1L << 60;

      

        // Loop through all the rows of the 'points' matrix

        for (int[] row : points) {

            // 'nextRowMaxPoints' is a temporary array to store the maximum points for the next row

            long[] nextRowMaxPoints = new long[n];

          

            // 'leftMax' tracks the maximum points from the left up to the current position

            long leftMax = -infinity;

          

            // 'rightMax' tracks the maximum points from the right up to the current position

            long rightMax = -infinity;

          

            // Forward pass to calculate the max points when coming from the left

            for (int j = 0; j < n; ++j) {

                leftMax = Math.max(leftMax, currentRowMaxPoints[j] + j);

                nextRowMaxPoints[j] = Math.max(nextRowMaxPoints[j], row[j] + leftMax - j);

            }

          

            // Backward pass to calculate the max points when coming from the right

            for (int j = n - 1; j >= 0; --j) {

                rightMax = Math.max(rightMax, currentRowMaxPoints[j] - j);

                nextRowMaxPoints[j] = Math.max(nextRowMaxPoints[j], row[j] + rightMax + j);

            }

          

            // Update 'currentRowMaxPoints' with the max points so far for the next iteration

            currentRowMaxPoints = nextRowMaxPoints;

        }

      

        // 'maxPoints' will store the overall maximum from 'currentRowMaxPoints'

        long maxPoints = 0;

        for (long pointsValue : currentRowMaxPoints) {

            maxPoints = Math.max(maxPoints, pointsValue);

        }

      

        // The final answer is the maximum points we can collect from the matrix

        return maxPoints;

    }

}
