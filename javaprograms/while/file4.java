
/*"Write a program to print all the perfect squares between 1 and 100, along with their square roots."*/


class file4
{
public static void main(String args[])
{

int start=1,end=100;



while(start<=end){ //1<=100t

int sqrt=(int)Math.sqrt(start);
if(sqrt*sqrt==start) //t

System.out.println(sqrt +"'s Perfect Square is "+ start);

start++;
}


}
}