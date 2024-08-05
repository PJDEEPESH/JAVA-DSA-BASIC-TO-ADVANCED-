class inblock 
{
    public static void main(String[] args) 
    {
        int a = 100;
        int b = 200;
        {
            //we cannot acces the initialized value outside the block which is already initialized we can update the value.
            int c = 1000;
            System.out.println(a);
        }    
        System.out.println(b);
    }    
}
