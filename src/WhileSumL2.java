public class WhileSumL2 {
    public static void main(String[] args) {
        int sum = 0, i=2;
        while (i <= 100) {
            sum = sum + i;
            i += 2;
        }
        System.out.println(+sum);
    }
}
