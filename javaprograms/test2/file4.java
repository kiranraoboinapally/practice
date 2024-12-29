class file4
{
public static void main(String args[])
	{
	int num=371,rem=0,sum1=0,sum2=0,count=0,pow1=0,temp=num;
	while(num!=0){			
	rem=num%10;		
	System.out.println(rem);	
	num=num/10;
	sum1+=rem;
	count++;
	pow1=(int)Math.pow(rem,count);
	sum2+=pow1;
			
			}
	System.out.println("Power of the "+temp+" with sum is "+sum2);
	System.out.println("Power of the "+temp+" with "+3+" is "+pow1);
	System.out.println("Sum of the "+temp+" is "+sum1);
	System.out.println("No of digits in the number "+temp+" are "+count);
	}
}
