class p13
{
public static void main(String args[])
	{ int rows=5,cols=5;
	for(int r=1;r<=rows;r++)
		{
		for(int c=1;c<=cols;c++)
			{
			boolean b=r==1||r==rows||c==cols||c==1;
			if(b)
			System.out.print(c+" ");
			else
			System.out.print("  ");
			}
		System.out.println();
		}
	}
}