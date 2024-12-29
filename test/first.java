/* find the largest number among three numbers using nested if else */


class first {

public static void main(String args[])
{
int num1=30,num2=17,num3=28;

/*
if(num1>num2 && num1>num3){
System.out.println("num1 is larger "+num1);
}
else if(num2>num3) {

System.out.println("num2 is larger "+num2);
}
else {
System.out.println("num3 is larger "+num3);
*/


System.out.println((num1>num2 && num1>num3)?("num1 is larger "+num1):
(num2>num3)?("num2 is larger "+num2):("num3 is larger "+num3));


}


}