/* Check Whether a character is number or special character or alphabet(Capital letter or small letter)*/


class third {

public static void main(String args[])
{
char input='a';
if(input>='A' && input<='Z'){
System.out.println("Its a Capital letter");
}
else if(input>='a' && input<='z'){
System.out.println("Its a small letter");
}
else if(input>='0' && input<='9'){
System.out.println("Its a number");
}
else {
System.out.println("Its a symbol");
}


}
}