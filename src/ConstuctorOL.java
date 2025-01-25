public class ConstuctorOL {


    public static void main(String[] args) {
        ConstuctorOL cl = new ConstuctorOL();
        cl = new ConstuctorOL(10,20);
        cl = new ConstuctorOL(10,20, 30);
    }

    public ConstuctorOL() {
        System.out.println("i am in default constructor ");
    }

    public ConstuctorOL(int a, int b) {
        System.out.println(a+b);
    }

    public ConstuctorOL(int a, int b , int c){
        System.out.println(a+b+c);
    }
}
