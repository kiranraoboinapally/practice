class p10
{
public static void main(String args[])
	{int rows=5,c,r;
	for(r=1;r<=rows;r++)
		{
		for(c=1;c<=r;c++)
			{
			if(c==1||c==r)
			System.out.print("# ");
			else
			System.out.print("  "); 
			}			
	System.out.println();
		}
	for(r=2;r<=rows;r++)
		{
		for(c=r;c<=rows;c++)
			{
			if(r==1||c==rows || c==r)
			System.out.print("# "); 
			else
			System.out.print("  ");
			}			
	System.out.println();
		}
	}

}