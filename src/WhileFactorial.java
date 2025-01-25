public class WhileFactorial {
    public static void main(String[] args) {
        int fact=1, i=5;
        while(i>=1){
            fact= fact*i;
            i--;
        }
        System.out.println(fact);
    }
}
