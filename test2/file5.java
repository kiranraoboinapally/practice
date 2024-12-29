import java.util.Scanner;
class file5
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int num=s.nextInt(),start=1,temp=num,count=0;
	for(;start<=num;start++)
		{
		if(num%start==0)
		count++;	
		}
	System.out.println(count==2?"Its a prime":"Its Not a prime");
	
	}

}