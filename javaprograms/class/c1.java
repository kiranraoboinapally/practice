class c1
{
public static void main(String args[])
	{
	c2 d1=new c2();
	d1.prime();
	d1.fibonacci();
	}

}
class c2
{
void prime()
	{

	for(int x=1;x<=10;x++)
		{
		int num=x,count=0;
		for(int start=2;start<=num/2;start++)
			{
			if(num%start==0)
			count++;
			}
			if(count==0 && num>=2)
			System.out.println(num+" is prime");
		}
	}


void fibonacci()
	{
	int a=0,b=1,c=0,num=10;
	System.out.println(a);
	for(int start=2;start<=num;start++)
		{
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}
	}
}