class file6
{
public static void main(String args[])
	{
	int num=1331,rem=0,rev=0,temp=num;
	for(;num!=0;num/=10)
		{
		rem=num%10;
		rev=rev*10+rem;
		}
	System.out.println(rev);
	System.out.println(temp==rev?"Its a palindrome":"Its not a palindrome");
	}
}