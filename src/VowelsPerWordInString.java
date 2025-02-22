public class VowelsPerWordInString {
    public static void main(String[] args) {
        String s = "Welcome to Kowshik to my Home";
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length ; i++) {
            String s4 = s1[i];
            s4 = s4.toUpperCase();
            int count =0;
            for (int j = 0; j < s4.length() ; j++) {
                if(s4.charAt(j)=='A' || s4.charAt(j)=='E' || s4.charAt(j)=='I' || s4.charAt(j)=='O' || s4.charAt(j)=='U'){
                  count++;
                }
            }
            System.out.println("Vowels in word "+s4 +" is " +count);

        }

    }

}
