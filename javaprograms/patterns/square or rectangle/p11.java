class p11
{
public static void main(String args[])
	{ int rows=7,cols=7;
	for(int r=1;r<=rows;r++)
		{
		for(int c=1;c<=cols;c++)
			{
			if(r==1 || r==rows || r==c || r+c==rows+1 || c==1 || c==cols)
			System.out.print("# ");
			else
			System.out.print(" ");
			}
		System.out.println();
		}
	}
}