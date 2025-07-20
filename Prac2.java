package DSA;

public class Prac2 {
	public static void main(String[] arg) {
		
		System.out.println("Name\t Height\t");
		
		System.out.println("1\t 5.5\t \n2\t 4.5 \n3\t 5.2\t \n4\t 5.6\t \n5\t 5\t");
		
		System.out.println("");
		
//		int[] name = {1, 2, 3, 4, 5};
//        double[] heights = {5.5, 4.5, 5.2, 5.6, 5.0};
//		
//        int maxHeight = 0;
//        
//        for(int i=1; i<heights.length; i++) {
//        	if(heights[i] > heights[maxHeight]) {
//        		maxHeight = i;
//        	}
//        }
//        
//        System.out.println("Patient " + name[maxHeight] + " has the maximum height of " + heights[maxHeight]);
        
        // Using Ternary Operator
        
        
		double p1 = 5.5;
		double p2 = 4.5;
		double p3 = 5.2;
		double p4 = 5.6;
		double p5 = 5.0;
		
		if(p1>p2?true:false) {
			System.out.println("P1 has Greater height than P2");
		}
		
		if(p2>p3?true:false) {
			System.out.println("P2 has Greater height than P3");
		}
		
		if(p3>p4?true:false) {
			System.out.println("P3 has Greater height than P4");
		}
		
		
		if(p4>p5?true:false) {
			System.out.println("P4 has Greater height than P5");
		}
		
		if(p5>p1?true:false) {
			System.out.println("P5 has Greater height than P1");
		}
        
	}
}
