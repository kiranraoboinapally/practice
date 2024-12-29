
//number reversing for last digits (included zero)  

class file8 {
    public static void main(String args[]) {
        int num = 12300, rem = 0, rev = 0, rev2 = 0, count1=0, count2=0, temp = num, diff=0, pow1=0;
        for (; num != 0; num /= 10) {
            rem = num % 10;						
	    count1++;							//5
            rev = rev * 10 + rem;
        }
        System.out.println("First reverse: " + rev);
        System.out.println("First reverse: " + count1);

        for (; rev != 0; rev /= 10) {
            rem = rev % 10;
            rev2 = rev2 * 10 + rem;
            count2++;							//3
        }
        System.out.println("Second reverse (original number): " + rev2);
	System.out.println("Second reverse: " + count2);
	diff=count1-count2;						//5-3=2
	pow1=(int)Math.pow(10,diff);					//10^2=100
	System.out.println(rev2*pow1);					//rev2*100=12300
    }
}
