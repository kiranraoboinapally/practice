//sum of first n natural numbers
/*"Write a program to calculate and print the cumulative sum of the first 5 natural numbers. Finally, print the total sum of the first 5 natural numbers."*/


class file9
{
public static void main(String args[])
{

int start=1,end=5,sum=0;
while(start<=end)
{
//start++;                    //prints 2,5,9,14,20
//System.out.println(sum);   //prints 0,1,3,6,10
sum+=start;
start++;
System.out.println(sum); //prints 1,3,6,10,15

}

System.out.println("Sum of First "+end+" Natural numbers is "+sum);

}

}