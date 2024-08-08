import java.util.*;
import java.util.ArrayList;
class arraylist2d 
{
    // This is  2d arraylist for the Strings
    // public static void main(String[] args) {
    //     ArrayList<ArrayList<String>> list = new ArrayList<>();
    //     Scanner scan = new Scanner(System.in);
    //     System.out.print("Enter 3 elemts in the each row : ");
    //     for(int i = 0;i<3;i++)
    //     {
    //         list.add(new ArrayList<>());
    //     }
    //     for(int i = 0;i<3;i++)
    //     {
    //         for(int j = 0;j<3;j++)
    //         {
    //             list.get(i).add(scan.next());
    //         }
    //     }
    //     System.out.println(list);
    // }
    // This is Interger in 2d arraylist 
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the elements: ");
        for(int i = 0;i<3;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                list.get(i).add(scan.nextInt());
            }
        }
        System.out.println(list);
    }
}

