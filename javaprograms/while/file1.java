/*"Write a program to print the multiplication table of a given number from 1 to 10. After each multiplication, print the word 'Hello'.*/


class file1
{
public static void main(String args[])
{
int n=3,start=1,end=10,pro=1;


while(start<=end)  

{

pro=n*start;              
System.out.println(n+"X"+start+"="+pro);
start++;
System.out.println("Hello");

}

}
}