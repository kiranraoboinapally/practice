/*"Write a program to calculate and print the product of all odd numbers between 1 and 22."*/



class file12
{
	public static void main(String args[])
		{

		int start=1,end=22,prod=1;
		while(start<=end)
			{
			if(start%2!=0)
			prod+=start;
			start++;
			}
			System.out.println("Product of "+end/2+" odd numbers is "+prod);


		}

}