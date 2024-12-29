class p1
{
public static void main(String args[])
	{
	int rows=5,r,c;
	char small='a';
	char cap='A',temp;
	for(r=1;r<=rows;r++)    
		{	
		
		for(c=rows;c>=r;c--)
			{
			if(r%2!=0)
				{
				
				System.out.print(cap+" ");			r1//A B C D E	odd capital letters ABCDE
				cap++;						r2//a b c d   	even small letters abcd
				}						r3//C D E	odd r==3 3rd capital letter CDE
			else							r4//cd		even Capital letters
				{						r5//E    	r==5 Capital letter
				System.out.print(small+" ");
				small++;
				}
			}	
		System.out.println();
		}
	}
}

/*
ABCDE
abcd
CDE
cd
E
*/