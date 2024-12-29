/*"Write a program to print the multiplication table of a given number from 1 to 10. Additionally, count and display the number of even and odd results in the table, and also print the base value and the last product."*/



class file5
{
public static void main(String args[])
{

int n=7,start=1,end=10,prod=1,sum=0,count_even=0,count_odd=0;
while(start<=end) 

{



prod=n*start;
System.out.println(n+"X"+start+"="+prod);

if(prod%2==0){
count_even++;
}
else{
count_odd++;
}
start++;


}
System.out.println(count_even+" are Even Numbers,"+" "+count_odd+" are Odd Numbers,"+" "+start+" is a Base Value,"+" "+prod);
}

}