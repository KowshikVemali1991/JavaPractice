public class StringReverseSentense {
    public static void main(String[] args) {
        String str = "Welcome koushik";
        String[] s2 = str.split(" ");
        String reverse = "";

        reverse = getReverse(s2);

        System.out.println("Reversed Sentence: " + reverse);


        String s1 = new String("Hi Kouhik");
        StringBuffer s3 = new StringBuffer("Hi Rajesh");
        System.out.println(s3);
        s3.append(" Welcome to horm");
        System.out.println(s3);
        System.out.println(s3.reverse());
        StringBuilder s4 = new StringBuilder("Hi Ayansh welcome");

        int length = getLength(s3);
        System.out.println(length);

    }

    private static String getReverse(String[] s2) {
        String reverse = "";
        for (int i = s2.length - 1; i >= 0; i--) {
            reverse += s2[i] + " " ;
        }
        return reverse;
    }

    private static int getLength(StringBuffer s3) {
        return s3.length();
    }
}

