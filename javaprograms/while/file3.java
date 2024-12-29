/*"Write a program to print numbers from 1000 to 100. For each number:
- Print 'Fizz' if the number is divisible by 3,
- Print 'Buzz' if the number is divisible by 5,
- Print 'Fizz and Buzz' if the number is divisible by both 3 and 5."*/


class file3
{
public static void main(String args[])
{

int start=1000,end=100;


while(start>=end)
{

if(start%3==0 && start%5==0)
System.out.println(start+" is Fizz and Buzz");
else if (start%3==0)
System.out.println(start+" is Fizz");
else
System.out.println(start+" is Buzz");
start--;
}


}

}