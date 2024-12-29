//this program for num value 3 you can change to any
/*"Write a program that repeatedly applies the following operations to a number:
- If the number is even, divide it by 2.
- If the number is odd, multiply it by 3 and add 1.
Repeat these operations until the number becomes 1, and print the value of the number after each operation."*/




class file13
{
public static void main(String args[]) 
	{
	int num=3; 				/*10			5		16			8		4		2		1 */
	while(num!=1)		/*10t and 10!=1t	5=5t and 5!=1t  16=16t and 16!=1t	8=8t and 8!=1t  4=4t and 4!=1t	2=2t and 2!=1t	1=1t and 1!=1f */
		{	
	    		if(num%2==0)		/*10%2==0t		5%2==0f		16%2==0t		8%2==0t		4%2==0t		2%2==0t		breaks */
			{
			num=num/2;		/*5					8			4		2		1 */
			System.out.println("num="+num);			
			}
				else  
				{
				num=3*num+1;			      //15+1											
				System.out.println("num="+num);       //16
				}
		}
	}
}