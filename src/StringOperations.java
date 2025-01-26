public class StringOperations {
    public static void main(String[] args) {
        String s = "welcome to koushik";
        System.out.println(s);
        String s1 = new String("Welcome to Rajesh");
        System.out.println(s1);
        Integer i = 10;
        System.out.println(i);
        String toMyHome = s1.concat(" to my home");
        System.out.println(toMyHome);
        System.out.println(s1);
        s1 = s1.concat(" to my home");
        System.out.println(s1);
        char c = s1.charAt(1);
        System.out.println(c);
        String lowerCase = s1.toLowerCase();
        System.out.println(lowerCase);
        String upperCase = s1.toUpperCase();
        System.out.println(upperCase);
        int length = s1.length();
        System.out.println(length);
        String s3 = "Kowshik";
        boolean flag = s3.equals("kowhik");
        System.out.println(flag);
        boolean b = s3.equalsIgnoreCase("KoWsHiK");
        System.out.println(b);
        boolean welcome = s1.startsWith("welcome");
        System.out.println(welcome);
        System.out.println(s1.endsWith("to my home"));
        System.out.println(s1.substring(18));
        System.out.println(s1.substring(11,17));
        String[] s2 = s1.split(" ");
        System.out.println(s2.length);
        System.out.println(s2);
        for (int j = 0; j < s2.length ; j++) {
            System.out.println(s2[j]);
        }


    }
}
