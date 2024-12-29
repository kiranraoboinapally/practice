class error {

public static void main(String args[]){


char input1='z',value1=(char)(input1+32),value2=(char)(input1-32);
System.out.println((input1>='A' && input1<='Z')?
value1:(input1>='a' && input1>='z')?
value2:"Invalid Character");

}
}




