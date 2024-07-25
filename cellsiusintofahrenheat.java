import java.util.Scanner;
class celsiusintofarhrenheaat
{
    public static void main(String[] args) 
    {
        System.out.print("Ente the celsius : ");
        Scanner scan = new Scanner(System.in);
        float c = scan.nextFloat();
        float result = (c * 9/5) + 32;
        System.out.println("The celsius "+c+ " is converted into fahrenheat : "+ result);

    }
}