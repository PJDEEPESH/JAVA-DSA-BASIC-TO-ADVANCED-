class Armstrong1 
{
    public static void main(String[] args) 
    {
        System.out.println("Armstrong numbers between 1 to 1000:");
        for (int i = 100; i < 1000; i++)
        {
            if (isArm(i))
            {
                System.out.print(i + " ");
            }
        }
    }    

    static boolean isArm(int i)
    {
        int sum = 0;
        int original = i;

        while (i > 0) 
        {
            int rem = i % 10;
            sum += Math.pow(rem, 3);
            i = i / 10;
        }

        return sum == original;
    }
}
