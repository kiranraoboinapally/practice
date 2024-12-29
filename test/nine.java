class nine {

public static void main(String args[])
{
int n=7,start=n,r=4,c=n-r,pro1=1,pro2=1,pro3=1;

while(start>=1)
{
pro1*=start;
start--;
}
System.out.println(n+" factorial value =" +pro1);

while(r>1)
{
pro2*=r;
r--;
}
System.out.println("r factorial value =" +pro2);

while(c>1)
{

pro3*=c;
c--;
}
System.out.println("c factorial value =" +pro3);


{
System.out.println(pro1/pro2*pro3);
}
}
}