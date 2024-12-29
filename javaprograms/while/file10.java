/*"Write a program to print all even numbers and odd numbers between 1 and 10 separately."*/


class file10
{
public static void main(String args[])
{

int start=1,end=10;
System.out.println("Even Numbers are ");
while(start<=end)
				{
if(start%2==0)
System.out.println(start);
start++;
}

System.out.println("Odd Numbers are ");
start=1;
while(start<=end)

{
if(start%2!=0)
System.out.println(start);
start++;
}

}

}