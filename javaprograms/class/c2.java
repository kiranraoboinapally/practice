class c2
{
public static void main(String args[])
	{
	demo d1=new demo();
	d1.m1();
	d1.m2();
	d1.m3();
	}
}
class demo
{
void m1()
	{
	int a=10,b=8,c=12;
	System.out.println((a>b&&a>c)?"a is greater":(b>c)?"b is greater":"c is greater");
	}
void m2()
	{
	int start=2,num=9292,count=0,sum=0,min=0,max=0;
	for(;start<=num/2;start++)
		{
		if(num%start==0)
			{
			count++;
			if(count==1)
				{
				min=start;
				}
			else
				{
				max=start;
				}
			}
		}
		System.out.println(min+" is min value");
		System.out.println(max+" is max value");
		sum=max+min;
		System.out.println(sum+" Sum value");
	}

char m3()

	{
	char letter='A';
	char res=(char)(letter+32);
	return res;
	}

} 

