/*"Write a program to calculate and print the sum of all even numbers between 1 and 22."*/


class file11
{
	public static void main(String args[])
		{

		int start=1,end=22,sum=0;
		while(start<=end)
			{
			if(start%2==0)
			sum+=start;
			start++;
			}
			System.out.println("Sum of "+end/2+" even numbers is "+sum);


		}

}