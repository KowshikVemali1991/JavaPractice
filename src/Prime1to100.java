public class Prime1to100 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 3; i <= 100; i++) {
            count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
