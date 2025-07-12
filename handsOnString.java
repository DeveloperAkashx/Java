import java.util.*;

public class handsOnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Please Enter your 1st name: ");
        String firstName = sc.nextLine();
        System.err.print("Please Enter your 2nd name: ");
        String secondName = sc.nextLine();

        String fullName = firstName + " " + secondName;
        
        System.out.println("Your name is "+ fullName);
    }
}
