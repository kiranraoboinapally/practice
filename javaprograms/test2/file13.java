class file13
{
public static void main(String args[])
	{
	int num=21567,rem=0,min=9;
	for(;num!=0;num/=10)
		{
		rem=num%10;
		if(min>rem)
		min=rem;
		}
	System.out.println(min);
	}
}