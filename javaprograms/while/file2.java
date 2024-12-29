/*"Write a program to print all the leap years between 1900 and 2024."*/

class file2
{
public static void main(String args[])
{
int start=1900,end=2024;



while(start<=end){

if((start%4==0 && start%100!=0)||start%400==0)
System.out.println(start+ " is a Leap year");
start++;
}

}

}