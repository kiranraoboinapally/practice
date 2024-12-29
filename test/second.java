/* Second Problem
Take Students marks(6 subjects) as input and calculate the percentage based on the percentage award grades as below
>90% Outstanding O
>70% Good G
>=50% Average A
>=30% Pass P
*/

class second {

public static void main(String args[])
{
int s1=10,s2=15,s3=34,s4=33,s5=30,s6=10,total=600,marks=(s1+s2+s3+s4+s5+s6);
double percentage=(double)(100*marks/total);


/*
if(percentage>90 && percentage<100){
System.out.println("Outstanding O");
}

else if(percentage>70 && percentage<89){
System.out.println("Good G");
}
else if(percentage>=50 && percentage<69){
System.out.println("Average A");
}

else if(percentage>=30 && percentage<49){
System.out.println("Pass P");
}
else {
System.out.println("Failed");
}
System.out.println("Percentage is "+percentage);

*/

System.out.println((percentage>90 && percentage<100)?
("Outstanding O"):(percentage>70 && percentage<89)?("Good G"):(percentage>=50 && percentage<69)?("Average A"):(percentage>=30 && percentage<49)?("Pass P"):("Failed"));
System.out.println("Percentage is "+percentage);






}
}