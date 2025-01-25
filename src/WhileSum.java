public class WhileSum {
    public static void main(String[] args) {
        int i = 0, j = 100, k=0, l=1, n=1,m=2;
        while (i <= 100) {
            System.out.println("i is " + i);
            i++;
        }

        System.out.println("*************");

        while (j >= 1) {
            System.out.println("j is " + j);
            j--;
        }

        System.out.println("*************");

        while(k <= 100){
            if(k % 2 == 0){
                System.out.println("k is " +k);
            }
            k++;
        }

        System.out.println("**************");

        while(l <= 100){
            System.out.println("L is " +l);
            l+=2;
        }
        System.out.println("*************");

        while(n<=12){
            System.out.println(m + "*" +n +"="+ (m*n));
            n++;
        }
    }
}
