class file15
{
public static void main(String args[])
	{
	int sum=0,a=1234,temp=a;
	while(a!=0)
		{
	int rem=a%10;
	int fact=1,start=1;
		for(;start<=rem;start++)
			{
			fact=fact*start;
			}
		
		sum+=fact;
		a/=10;
		System.out.println(rem+" factorial is "+fact);
		}
	System.out.println(sum);
	}
}