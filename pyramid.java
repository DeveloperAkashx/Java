class pyramid
{
public static void main(String[]args)
{
int n=4,m=5;
for(int i=0 ; i<n ; i++)
{
for(int j=0 ; j<m-i ; j++)
{
	System.out.print(" ");
}
for(int k=0 ; k<i ; k++)
{
	System.out.print("* ");
}
System.out.println();
}
}
}