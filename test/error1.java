class error1 {

public static void main(String args[]){

/*
char input1='z',value1=(char)(input1+32),value2=(char)(input1-32);
if (input1>='A' && input1<='Z')
{
System.out.println(value1);
}
else if (input1>='a' && input1>='z')
{
System.out.println(value2);
}
else
{
System.out.println("Invalid Character");
}



*/













char c='R';
char  s= (c>='a' && c<='z')?(char)(c-32):(char)(c+32);
System.out.println(s);

}
}