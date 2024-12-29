
class p23
{
public static void main(String args[])
	{int rows=5,r,c;
	for(r=1;r<=rows;r++)
		{
		for(c=rows;c>=r;c--)
			{
			System.out.print("  ");				
			}
		for(c=2;c<=r*2;c++)
			{
			if(c==2||r*2==c)
			System.out.print("+ ");
			else
			System.out.print("  ");
			}
		System.out.println();
		}
	for(r=2;r<=rows;r++)
		{
		for(c=1;c<=r;c++)
			{
			System.out.print("  ");
			}
		for(c=rows*2;c>=r;c--)
			{
			if(rows*2==c||c==2*r)
			System.out.print("+ ");
			else
			System.out.print("  ");
			}
		System.out.println();
		}	
	}
}


/*
# # # # # +
# # # # + $ +
# # # + $ $ $ +
# # + $ $ $ $ $ +
# + $ $ $ $ $ $ $ +
# # + $ $ $ $ $ + #
# # # + $ $ $ + # #
# # # # + $ + # # #
# # # # # + # # # #


*/