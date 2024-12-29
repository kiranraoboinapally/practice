class p8
{
public static void main(String args[])
	{int rows=5;
	for(int r=1;r<=rows;r++)			//1
		{//1
		for(int c=1;c>=r;c--)			//1 1<=2t	2 2<=1t		1<=2t
			{
			System.out.print(c+" ");	//1 
			}				//1
	System.out.println();
		}
	}
}
