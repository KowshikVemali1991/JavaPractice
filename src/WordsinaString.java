public class WordsinaString {
    public static void main(String[] args) {
        String str = "Welcome to Kowshik to my home";
        int length = str.length();
        System.out.println(length);
        int count=0;
        for (int i = 0; i < length; i++) {
            if(str.charAt(i) == ' '){
                count++;
            }

        }
        System.out.println(count+1);
    }
}
