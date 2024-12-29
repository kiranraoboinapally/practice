//amstrong in range of 1 to 10000

class file14
{
public static void main(String args[])
	
	{

	for(int x=1;x<=10000;x++){
		int num=x,rem=0,sum=0,count=0,temp=num,power=0;
		for(;num!=0;num/=10)
			{
	
			rem=num%10;
			count++;
			}
		num=temp;
		for(;num!=0;num/=10)
			{
			rem=num%10;
			power=(int)Math.pow(rem,count);
			sum+=power;
			}
			if(temp==sum){
			System.out.println(temp+" is an armstrong ");
					}
			}	

	}
}