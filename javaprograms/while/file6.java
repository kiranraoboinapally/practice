//Forward Iteration for Printing Positive numbers

/*"Write a program to print numbers from 1 to 10 in two steps:
- Print the current value of `start`.
- Then, increment `start` and print the updated value.
Finally, print the value of `start` after the loop ends."*/

class file6
{
public static void main(String args[])
{

int start=1,end=10;

while(start<=end)

{
System.out.println(start); //outputs 1,2,3...,9,10 if its above ++
start++;
System.out.println(start);//outputs 2,3,4,5,...10,11 if its below ++
}

System.out.println(start); /* it prints last value i.e., only prints base value 11 */
}

}