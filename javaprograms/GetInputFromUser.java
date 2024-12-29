import java.util.Scanner;
class GetInputFromUser
{
public static void main(String args[])
{

int a;
float b;
String s;

Scanner in = new Scanner(System.in);
{

System.out.println("Enter a string");
s=in.nextLine();
System.out.println("You Entered a String "+s);

System.out.println("Enter an Integer");
a=in.nextLine();
System.out.println("You Entered a Integer" +a);

System.out.println("Enter a Float");
b=in.nextLine();
System.out.println("You Entered a Float" +b);

}
}
}