class file12
{
public static void main(String args[])
	{
	int num=780123,max=0,rem=0;
		for(;num!=0;num/=10)
			{
			rem=num%10; // 3 2 1 0 7 8
			if(max<rem) // 0<3t 3<2f 3<1f 3<0f 3<7t 7<8t
			max=rem;    //3                     7   8
			}
		System.out.println(max);
	}
}