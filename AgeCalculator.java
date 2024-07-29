import java.util.*;
import java.time.LocalDate;         // using Package of Current Date
class AgeCalculater
{
    public static void main(String[]args)
    {
        int day , month , year ;
        Scanner sc = new Scanner(System.in);

        int currentyear = 2024;

        // LocalDate currentdate = LocalDate.now();

        // System.out.println("Current Date is : " +currentdate);

        // long currentyear = currentdate.getYear();

        // System.out.println("Current Date is : " +currentyear);

        System.out.println("Enter the Day of Birth : ");
        day = sc.nextInt();

        System.out.println("Enter the Month of Birth : ");
        month = sc.nextInt();

        System.out.println("Enter the Year of Birth : ");
        year = sc.nextInt();

        long age = currentyear - year;

        System.out.println("Your age is : " + age);
    }
}