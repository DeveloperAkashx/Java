import java.util.Scanner;

public class Double {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        if (true)
        {
            System.out.println("Average Value : " + (d1 + d2) / 2);
        } 
        else
        {
            System.out.println("Error Message Display");
        }
    }
}
