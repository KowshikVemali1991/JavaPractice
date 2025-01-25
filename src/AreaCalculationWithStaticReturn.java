public class AreaCalculationWithStaticReturn {
    public static void main(String[] args) {
        int a = 20, b = 30;
        double c = 20;
        System.out.println("Area of Circle is " + calculateArea(c));
        System.out.println("Area of Square is " + calculateArea(a));
        System.out.println("Area of Rectangle is " + calculateArea(a, b));
        System.out.println("Area is " +calculateArea(30d));
    }
    public static double calculateArea(double a) {
        return Math.PI * a * a;
    }

    public static int calculateArea(int a) {
        return a * a;
    }

    public static int calculateArea(int a, int b) {
        return a * b;
    }
}
