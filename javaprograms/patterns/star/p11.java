class p11
{
public static void main(String args[])
	{
	int rows=5;
	char cap='A';
	for(int r=1;r<=rows;r++)
		{char temp=cap;
		for(int c=r;c<=rows;c++)
			{
			System.out.print(temp+" ");
			temp++;
			}
		cap='a';
	System.out.println();
		}
	}
}