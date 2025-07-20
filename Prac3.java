package DSA;

public class Prac3 {
	public static void main(String[] arg) {
		
		// Swap two Numbers using 3rd Variable
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swap : a = " + a + ", b = " +b);
		
		int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swap: a = " + a + ", b = " + b);
        
	}
}
