import java.util.*;
import java.util.ArrayList;
class arraylist 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        // Assigning values we only 
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // list.add(4);
        // list.add(2);
        // list.add(554);
        // list.add(533);
        // System.out.println(list);
        // list.set(2,88);
        // list.remove(4);
        // System.out.println(list);
        // now taking input from user
        for(int i = 0;i<5;i++)
        {
            list.add(scan.nextInt());

        }
        //output using for loop
        for(int i = 0;i<5;i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println(list);

    }
}
