class p5
{
public static void main(String args[])
	{ int rows=5,cols=5;
	for(int r=1;r<=rows;r++)
		{
		for(int c=1;c<=cols;c++)
			{
			if(r==2 && c==2 || r==2 && c==5 || r==4 && c==2)
			System.out.print("$ ");
			else
			System.out.print("- ");
			}
		System.out.println();
		}
	}
}