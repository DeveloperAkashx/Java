import java.util.*;

class Mythread extends Thread 
{
    public void run()
    {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Thread of A..."+i);
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
    }
}

class Newthread extends Thread 
{
    public void run()
    {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Thread of B..."+i);
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
    }
}

class MultiThread
{
public static void main (String[]args)
{
    Mythread ab = new Mythread();
    Newthread xy = new Newthread();
    
    ab.start();
    xy.start();
}
}