import java.util.Scanner;
public class Ascii
{
public static void main(String args[])
{
char ch;
System.out.println("enter a character");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
 int ascii=(int)ch;
System.out.println("ASCII of ch"+ascii);
}
}
