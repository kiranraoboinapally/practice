class file16
{
public static void main(String args[])
	{

	for(int x=1;x<=100;x++){
	int num=x,rev=0,rem=0,temp=num;
		for(;num!=0;num/=10)
			{
			rem=num%10;
			rev=rev*10+rem;
			}
			if(temp==rev)
				{
				System.out.println(temp+"is a palindrome");
				}
		}
	}
}