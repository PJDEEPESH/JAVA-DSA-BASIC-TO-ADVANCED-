class Solution 
{
    public List<Integer> addToArrayForm(int[] num, int k) 
    {
        ArrayList<Integer> array = new ArrayList<>();
        int i = num.length - 1;

        // Start adding from the last digit of the array
        while (i >= 0 || k > 0) 
        {
            if (i >= 0) 
            {
                k += num[i];
                i--;
            }
            array.add(k % 10);  // Add the last digit of the sum to the list
            k /= 10;             // Remove the last digit from k
        }

        // Reverse the list to get the correct order
        int start = 0;
        int end = array.size() - 1;
        while(start < end)
        {
            int temp = array.get(start);
            array.set(start, array.get(end));
            array.set(end, temp);
            start++;
            end--;
        }

        return array;
    }
}
