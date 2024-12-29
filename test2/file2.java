import java.util.Scanner;
class file2
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt(),b=s.nextInt(),c=0,start=1,end=10;
	System.out.println(a);		//0   1
	System.out.println(b);		//1   1
	for(;start<=end;start++)
	{
	c=a+b;				//1   1
	b=c;				//1
	a=b;				//1
	System.out.println(c);		//1
	}
	}
}
