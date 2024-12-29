import java.util.Scanner;

class file11
{	public static void main(String args[])
	{

	Scanner s=new Scanner(System.in);
	System.out.println("Enter a Number to check its Twisted Prime or Not? :");
	int num=s.nextInt(),start=2,count=0,temp=num,rem=0,rev=0;
	for(;start<=num/2;start++)
		{
		if(num%start==0)
		count++;
		}
	if(count==0 && start>=2)
			{
			System.out.println(num+" Its a prime");
			num=temp;
			for(;num!=0;num/=10)
				{
				rem=num%10;
				rev=rev*10+rem;
				}
				num=rev;
				for(;start<=num/2;start++)
				{
				if(num%start==0)
				count++;
				}
				System.out.println((count==0 && start>=2)?(num+" Its a prime AND also a Twisted Prime for "+temp):(temp+" is a Prime,but "+num+" is not a Prime...\nSo It's not a Twisted prime"));
			}

		else	{
			System.out.println(num+" Its not a twisted a prime");
			}
	}
}
			
