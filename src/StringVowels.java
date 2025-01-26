public class StringVowels {
    public static void main(String[] args) {
        String str = "Welcome to String Operations JAVA";
        int length = str.length();
        str = str.toLowerCase();
        int vcount = 0;
        int ccount =0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vcount = vcount + 1;
            }
            else{
                ccount++;
            }
        }
        System.out.println("Vowels count is "+vcount);
        System.out.println("Consonent count is "+ccount);

    }


}

