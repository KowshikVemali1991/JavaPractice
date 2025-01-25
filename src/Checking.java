public class Checking {
    public static void main(String[] args) {
        Checking c = new Checking();

        c = new Checking(10,20);
    }

    public Checking() {
        System.out.println("i am in default");
    }

    public Checking(int a, int b) {
        System.out.println(a+b);
    }
}
