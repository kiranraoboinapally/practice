class p12
{
public static void main(String args[])
	{int rows=5;
	for(int r=1;r<=rows;r++)
		{
		for(int c=rows;c>=r;c--)
			{
			System.out.print("# ");
			}
		for(int c=2;c<=r*2;c++)
			{

			if(c==2||r==rows || r*2==c)
			System.out.print("$ ");
			else
			System.out.print("  ");
			}

	System.out.println();
		}
	}
		
}