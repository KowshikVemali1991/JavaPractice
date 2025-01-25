public class SumOfDigits1To1000WithWhile {
    public static void main(String[] args) {
        int i = 10;
        while (i <= 1000) {
            int nmbr = i, sum = 0;
            while (nmbr > 0) {
                int digit = nmbr % 10;
                sum = sum + digit;
                nmbr = nmbr / 10;
            }
            System.out.println("The sum of digits " + i + " is " + sum);
            i++;
        }
    }

}