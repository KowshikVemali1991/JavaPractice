public class AreaCalculationWithReturn {
    public static void main(String[] args) {
        int a = 20, b = 30;
        double c = 20;
        AreaCalculationWithReturn area = new AreaCalculationWithReturn();
        double circleArea = area.calculateArea(c);
        System.out.println("Area of Circle is " + circleArea);
        int i = area.calculateArea(a);
        System.out.println("Area of Square is " + i);
        int j = area.calculateArea(a, b);
        System.out.println("Area of Rectangle is " + j);

        double v = area.calculateArea(30d);
        System.out.println("Area is " +v);


    }

    public double calculateArea(double a) {
        return Math.PI * a * a;
    }

    public int calculateArea(int a) {
        return a * a;
    }

    public int calculateArea(int a, int b) {
        return a * b;
    }
}
