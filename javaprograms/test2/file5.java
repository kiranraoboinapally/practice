class file5
{
public static void main(String args[])
	{
	int num=321,count=0,temp=num,pow=0,sum=0;
	for(;num!=0;num/=10)	
		{
		int rem=num%10;
		count++;
		}
	System.out.println(count);
	num=temp;
	for(;num!=0;num/=10)
		{
		int rem=num%10;
		pow=(int)Math.pow(rem,count);
		sum+=pow;
		}
	System.out.println(sum);
	System.out.println(temp==sum?"Amstrong":"Not AmStrong");
	}
}