
class Area_Cir
{
    int radius = 10;
    public double  Area()
    {
        return Math.PI*Math.pow(radius,2);
    }

    public double Circumference()
    {
        return 2*radius*3.14;
    }
}

class Circle
{
    public static void main(String[] args)
    {
        Area_Cir c1  = new Area_Cir();
        System.out.println("Area = " + c1.Area());
        System.out.println("Circumference = " + c1.Circumference());
    }
}

