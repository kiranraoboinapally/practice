class fourth {

public static void main(String args[])
{
int p1=1800,p2=2000,p3=1500,p4=1600,p5=500,p6=3500,p7=5000,total1=p1+p2+p3+p4+p5+p6+p7,total2=p7+p4,total3=p3+p5;

double discount1=(double)(10000*5/100),discount2=(double)(5000*2.5/100);

if(total1>=10000){
System.out.println("5% discount more than 10000 on goods purchase " +(total1-discount1));
}

else if(total1<9999 && total1>=5000){
System.out.println("2.5% discount more than 5000 "+(total1-discount2));
}
else {
System.out.println("No discount "+total1);
}

}
}