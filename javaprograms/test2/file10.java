class file10
{
public static void main(String args[])
	{
	int num=4523,rem=0,count=0,sum=0,prod=1,count1=0,start=1,prime=0;
	for(;num!=0;num/=10)
		{
		rem=num%10;
		count++;
		if(count==1||count==4){
			sum+=rem;
			}

		else{
			prod*=rem;
			}

		}
	System.out.println(sum);
	System.out.println(prod);
	prime=sum+prod;
	System.out.println(prime);
	for(;start<=prime;start++)
		{
		if(prime%start==0)
		count1++;
		}
	System.out.println(count1==2?prime+" Its a prime":prime+" Its not a prime");
	}
}