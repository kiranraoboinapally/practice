class ten {

public static void main(String[] args) {
char input = 'Q';

if (input >= 'A' && input <= 'Z') {

while (input < 'Z') {
input++;  
System.out.println("Next letter: " + input);
 

}
} 

else 

{
System.out.println("Please enter a valid capital letter between A and Z.");
}
}
}

