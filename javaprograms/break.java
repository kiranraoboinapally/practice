class break2 {
    public static void main(String[] args) {
        char inputChar = 'A';
        if (inputChar >= 'A' && inputChar < 'Z') {
            for (char c = (char) (inputChar + 1); c <= 'Z'; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        } else {
            System.out.println("Please enter a valid capital letter (A-Z), excluding Z.");
        }
    }
}
