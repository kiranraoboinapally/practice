//backward iteration for numbers

/*"Write a program to print numbers starting from 10 down to 1. After printing each number, decrement it and print the updated value. Finally, print the last value of the variable after the loop ends."*/



class file7
{
public static void main(String args[])
{

int start=10,end=1;
while(start>=end)

{

System.out.println(start); //prints 10,9,8,7,6,5,4,3,2,1
start--;                                                
System.out.println(start); //prints 9,8,7,6,5,4,3,2,1,0
}
System.out.println(start); //prints base value 0

//10,9,9,8,8,7,7,...1,1,0,0 total output shows as this

}

}