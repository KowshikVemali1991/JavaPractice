public class AmstrongUntill10000 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int sum = 0, nmbr =i;
            while (nmbr > 0) {
                int rem = nmbr % 10;
                sum = sum + (rem * rem * rem);
                nmbr = nmbr / 10;
            }

            if (sum == i) {
                System.out.println("The number " + i + " is amstrong ");
            }

        }
    }
}