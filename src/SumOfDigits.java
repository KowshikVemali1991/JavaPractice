public class SumOfDigits {
    public static void main(String[] args) {
        int sum = 0, nmbr = 524, temp=nmbr;
        while (nmbr > 0) {
            int digit = nmbr % 10;
            sum = sum + digit;
            nmbr = nmbr / 10;
        }
        System.out.println("The sum of digits " +temp+" is " +sum);

    }
}

