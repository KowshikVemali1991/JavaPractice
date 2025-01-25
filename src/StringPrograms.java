public class StringPrograms {
    public static void main(String[] args) {
        String s = "koushik";
        char c = s.charAt(4);
        System.out.println(c);

        s= s.toUpperCase();
        System.out.println(s);
        s = s.toLowerCase();
        System.out.println(s);

        s = s.concat(" kumar");
        System.out.println(s);

        boolean flag = s.equals("koushik kumar");
        System.out.println(flag);
    }
}
