public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();  //default constfuctor
        mo.addition(10,20);
        mo.addition(10,20,30);

        int c= sub(10,20,30);
        System.out.println(c);

        System.out.println(sub(10,20));
    }

    public void addition(int a, int b ) {
        System.out.println(a+b);
    }

    public void addition(int a, int b , int c) {
        System.out.println(a+b+c);
    }


    public static int sub(int a, int b ) {
        return a-b;
    }

    public static int sub(int a, int b , int c) {
        return a-b-c;
    }




}
