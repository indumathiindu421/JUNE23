import java.util.Scanner;
class InputSwap1
{

public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number:");
int num1,num2;
num1=scob.nextInt();
num2=scob.nextInt();
int temp;
temp=num1;
num1=num2;
num2=temp;
System.out.println(num1+" "+num2);
}
}
