public class Palendrome {
    public static void main(String[] args) {
        int sum = 0, nmbr = 121, temp = nmbr;
        while (nmbr > 0) {
            int rem = nmbr % 10;
            sum = sum * 10 + (rem);
            nmbr = nmbr / 10;
        }

        if (sum == temp) {
            System.out.println("The number " + temp + " is palendrome ");
        } else {
            System.out.println("The number " + temp + " is not palendrome ");
        }
    }
}
