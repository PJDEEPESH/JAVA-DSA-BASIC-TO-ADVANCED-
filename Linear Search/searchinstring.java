import java.util.Arrays;

class searchinstring 
{
    public static void main(String[] args) 
    {
        String name = "Deepu";
        char target = 'f';
        System.out.println(searchstring(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }    
    static boolean searchstring(String name,char target)
    {
        if(name.length() == 0)
        {
            return false;
        }
        // for(int i = 0 ; i < name.length() ; i++)
        // {
        //     if(target == name.charAt(i))
        //     {
        //         return true;
        //     }
        // }
        // Enhanced for loop
        for(char i : name.toCharArray())
        {
            if(i == target)
            {
                return true;
            }
        }
        return false;
    }
}
