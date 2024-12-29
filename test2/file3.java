import java.util.Scanner;
class file3
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int num1=s.nextInt(),num2=s.nextInt(),num3=s.nextInt();
	System.out.println(num1>num2 && num1>num3?"num1 is larger":num2>num3?"num2 is larger":"num3 is larger");
	}

}