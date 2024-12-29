class p2
{
public static void main(String args[])
	{int rows=5,cols=7;
	for(int r=1;r<=rows;r++)
		{
		for(int c=1;c<=cols;c++)
			{
			if(r%2==0 && c%2==0)		       //rc 1 2 3 4 5 6 7
 			System.out.print("# ");			//1 # # # # # # #
			else					//2 # - # - # - #  22, 24, 26
			System.out.print("- ");			//3 # # - # - # #  33, 35
			}					//4 # - # - # - #  42, 44, 46
		System.out.println();				//5 # # # # # # #
		}
	}
}