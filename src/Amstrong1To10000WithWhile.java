public class Amstrong1To10000WithWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10000) {
            int sum = 0, nmbr = i;
            while (nmbr > 0) {
                int rem = nmbr % 10;
                sum = sum + (rem * rem * rem);
                nmbr = nmbr / 10;
            }

            if (sum == i) {
                System.out.println("The number " + i + " is amstrong ");
            }
            i++;
        }
    }
}