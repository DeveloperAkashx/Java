import java.util.*;

interface client
{
    void input();
    void output();
}
class employee implements client
{
    String name;
    double salary;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        name=sc.nextLine();
        System.out.println("Enter your Salary : ");
        salary=sc.nextDouble();
    }

    public void output()
    {
        System.out.println("Employee name is : "+name);
        System.out.println("Employee salary is : "+salary);
    }

    static public void main(String[]args)
    {
        client c=new employee();
        c.input();
        c.output();
    }
}