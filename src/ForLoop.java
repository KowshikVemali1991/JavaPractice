public class ForLoop {
    public static void main(String[] args) {
        int i, j=2;
        for (i = 1; i <= 100; i++) {
            System.out.println("i is " + i);
        }
        System.out.println("*****************");
        for (i = 100; i >= 1; i--) {
            System.out.println("i is " + i);
        }
        System.out.println("*****************");
        for (i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("i is " + i);
            }
        }
        System.out.println("*************");
        for (i = 2; i <= 100; i += 2) {
            System.out.println("i is " + i);
        }
        System.out.println("*************");
        for(i= 1; i<=100;i+=2){
            System.out.println("i is " +i);
        }
        System.out.println("*************");
        for(i=1;i<=12;i++){
            System.out.println(j + " * " +i + " = " +(j*i));
        }
    }
}
