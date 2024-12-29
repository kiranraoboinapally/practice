import java.util.Scanner;
class file1
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int num=s.nextInt(),rem=0,temp=num,rev=0,rev2=0;//123
		for(;num!=0;num/=10)	
			{
			rem=num%10;//3
			rev=rev*10+rem;//321
			}
	System.out.println(temp==rev2?"Its a palindrome":"Not a palindrome");
	}

}