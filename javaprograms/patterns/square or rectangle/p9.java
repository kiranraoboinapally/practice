class p9
{
public static void main(String args[])
	{ int rows=5,cols=5;
	for(int r=1;r<=rows;r++)
		{
		for(int c=1;c<=cols;c++)
			{
			if(r==c || r+c==rows+1)
			System.out.print("X ");
			else
			System.out.print("- ");
			}
		System.out.println();
		}
	}
}