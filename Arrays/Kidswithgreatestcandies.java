class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for(int item : candies)
        {
            if(item > max)
            {
                max = item;
            }
        }
        for(int i = 0;i<candies.length;i++)
        {
            candies[i] += extraCandies;
            if(candies[i]  >= max)
            {
                ans.add(true);
            }
            else
            {
                ans.add(false);
            }
        }
        return (ans);

    }
}
