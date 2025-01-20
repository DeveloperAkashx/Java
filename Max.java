import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        System.out.println("Max Number is: " +Math.max(n1,n2));
    }
}
