package DSA;

public class starP2 {

    static void Pattern(int n)
    {
        for (int i=1; i<n ; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void Pattern2nd(int n)
    {
        for (int i=1; i<n ; i++){
            for (int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern3rd(int n)
    {
        for (int i=1; i<n ; i++){
            for (int j=n; j>i; j--){
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern(5);
        Pattern2nd(5);
        Pattern3rd(5);
    }
}
