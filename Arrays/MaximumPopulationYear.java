class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] populationChanges = new int[101]; // Array to track population changes from 1950 to 2050.

        for (int i = 0; i < logs.length; i++) {
            int birthYear = logs[i][0] - 1950;
            int deathYear = logs[i][1] - 1950;
            
            populationChanges[birthYear]++; // Increment population at birth year.
            populationChanges[deathYear]--; // Decrement population at death year.
        }

        int maxPopulation = 0;
        int maxYear = 0;
        int currentPopulation = 0;

        for (int year = 0; year < 101; year++) {
            currentPopulation += populationChanges[year];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxYear = year;
            }
        }

        return 1950 + maxYear; // Return the year with the maximum population.
    }
}
