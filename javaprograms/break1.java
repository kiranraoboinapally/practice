class break1 {
    public static void main(String[] args) {
       
        char inputChar = 'A'; 
        if (inputChar >= 'A' && inputChar < 'Z') {
            char currentChar = (char) (inputChar + 1);
            while (currentChar <= 'Z') {
                System.out.print(currentChar + " "); 
                break;
            }
            System.out.println(); 
        } else {
            System.out.println("Please enter a valid capital letter (A-Z), excluding Z.");
        }
    }
}
