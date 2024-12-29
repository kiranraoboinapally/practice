class fact
{
public static void main(String args[])
	{

	int num=145,rem=0,temp=num,sum=0,num1=0;
		for(;num!=0;num/=10)
			{
			rem=num%10;
		num1=rem;
		int prod=1,start=1;
		for(;start<=num1;start++)
			{
			prod=prod*start;
			}
		sum+=prod;
		}
		System.out.println(sum);
	}
}