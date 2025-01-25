public class Amstrong {
    public static void main(String[] args) {
        int sum = 0, nmbr = 153, temp = nmbr;
        while (nmbr > 0) {
            int rem = nmbr % 10;
            sum = sum+ (rem*rem*rem);
            nmbr = nmbr / 10;
        }

        if (sum == temp) {
            System.out.println("The number " + temp + " is amstrong ");
        } else {
            System.out.println("The number " + temp + " is not amstrong ");
        }
    }
}
