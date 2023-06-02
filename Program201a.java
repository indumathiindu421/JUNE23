import java.util.Scanner;
public class Program201a
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter the number");
n=sc.nextInt();
if(n/2*2==n)
{
System.out.println("even\n");
System.out.println(n+"is even \n");
}
else
{
System.out.println("odd\n");
System.out.println(n+"is odd \n");
}
}
}