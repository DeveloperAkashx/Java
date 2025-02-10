public class condition {
    public static void main(String[] args) {
        int mark = 90;
        if (mark<=100 && mark>=90) {
            System.out.println("Grade A");
        }

        else if (mark<=89 && mark>=80) {
            System.out.println("Grade B");
        }
        else{
            System.out.println("Sorry! try next time");
        }
    }
}
