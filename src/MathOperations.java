public class MathOperations {
    public static void main(String[] args) {
        int a =10, b=20;
        addition(a,b);
        MathOperations mo = new MathOperations();
        int subtraction = mo.subtraction(a, b);
        System.out.println(subtraction);
        int multi = multi(30, 40);
        System.out.println(multi);
        mo.division(a,b);
        int remainder = mo.remainder(a, b);
        System.out.println(remainder);


    }
    public static void addition (int a, int b){
        System.out.println(a+b);
    }
    public int subtraction (int a, int b) {
        return (a-b);
    }
    public static int multi(int a, int b){
        return (a*b);
    }
    public void division(int a, int b){
        System.out.println(a/b);
    }
    public int remainder(int a, int b){
        return(a%b);
    }

}
