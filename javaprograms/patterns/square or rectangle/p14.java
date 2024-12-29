class p14
{
public static void main(String args[])
	{ int rows=4,cols=4;
	char letter='A';				//A		***B 		***C
	for(int r=1;r<=rows;r++)
		{char temp=letter;			//A B C D E 	B C D E F	C
		for(int c=1;c<=cols;c++)		//t t t t f 	t t t t f	t
			{
			System.out.print(temp+" ");	//A B C D   	B C D E		C
			temp++;				//B C D E   	C D E F		D
			}
		letter++;				//***B 		***C
		System.out.println();
		}
	}
}