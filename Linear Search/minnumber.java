class minnumber 
{
    public static void main(String[] args) 
    {
        int[] arr= {2,2,1,31,3,434,54,764,0,43,2};
        Mmin(arr);
    }
    static void Mmin(int[] arr)
    {
        int min = arr[0];
        // for(int j = 0 ; j < arr.length ; j++)
        // {
        //      min = Math.min(arr[j],min);
        // }
        for(int i : arr)
        {
            min = Math.min(i,min);// enhanced for loop
        }
        System.out.println(min);
        
        
    }
}
