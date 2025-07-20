package DSA;

public class Prac4 {
    public static void main(String[] args) {
    	
    	// Swap two numbers without 3rd Variable
    	
        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b;		// a= 10+20 =30
        b = a - b;		// b= 30-20 =10
        a = a - b;		// a= 30-10 =20

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
