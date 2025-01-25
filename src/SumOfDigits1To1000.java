public class SumOfDigits1To1000 {
    public static void main(String[] args) {
        for (int i = 10; i <= 1000; i++) {
            int nmbr = i, sum = 0;
            while (nmbr > 0) {
                int digit = nmbr % 10;
                sum = sum + digit;
                nmbr = nmbr / 10;
            }
            System.out.println("The sum of digits " + i + " is " + sum);

        }
    }

}