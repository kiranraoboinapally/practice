import java.util.Scanner;


class file9
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number 1: ");
	int num1=s.nextInt();
	System.out.println("Enter a number 2: ");
	int num2=s.nextInt();
	int start=1,count1=0,count2=0;
	  		
	if ( num1-num2==2 || num2-num1==2 )
		{
		System.out.println("True diff");
		for(;start<=num1;start++)
		if(num1%start==0)
		count1++;
		System.out.println(count1);
		
		start=1;
		for(;start<=num2;start++)
		if(num2%start==0)
		count2++;
		System.out.println(count2);
		System.out.println((count1==2 && count2==2)?"Its a twin prime":"Its not a twin prime");
		}
	else
		{
		System.out.println("False diff");
		}
	}
}