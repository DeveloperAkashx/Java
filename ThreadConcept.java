import java.util.*;

class Mythread extends Thread
{
    public void run()
    {
        System.out.println("1st Thread is Executed");
    }
}

class Newthread extends Thread
{
    public void run()
    {
        System.out.println("2nd Thread is Executed");
    }
}

public class ThreadConcept
{
public static void main(String[]args)
{
    Mythread ab = new Mythread();
    Newthread xy = new Newthread();
    
    ab.start();
    xy.start();
}
}