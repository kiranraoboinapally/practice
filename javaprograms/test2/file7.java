//largest digit in a given number

class file7
{
public static void main(String args[])
	{
	int num=49578,rem=0,max=0,temp=num,min=num;
	for(;num!=0;num/=10)
		{
		rem=num%10; //8 7 5 9 4
		if(rem>max)
		max=rem;
		}
System.out.println(max+ " is Maximum Value in the Given number");

		num=temp;
		for(;num!=0;num/=10)
		{
		rem=num%10; //8 7 5 9 4
		if(rem<min)
		min=rem;
		}
System.out.println(min+" is Minumum Value in a given Number");
	}
}