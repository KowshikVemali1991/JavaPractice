public class HelloWorld {

    public HelloWorld() {
        //default contructor
        System.out.println("i am in default contructor");
    }

    public HelloWorld (String name) {
        //parameterized constructor
        System.out.println("welcome to "+name);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to java");
        m1();
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.m2();

        HelloWorld helloWorld1 = new HelloWorld("koushik");
        helloWorld1.m2();
        helloWorld1.m2("rajesh");
    }

    public static void m1 (){
        System.out.println("welcome to m1");
    }

    public void m2() {
        System.out.println("Welcome to m2 ");
    }
    public void m2(String name) {
        System.out.println("Welcome to m2 "+ name);
    }

}
