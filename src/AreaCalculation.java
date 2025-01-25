public class AreaCalculation {
    public static void main(String[] args) {
        int a = 20, b = 30;
        double c = 20;
        AreaCalculation area = new AreaCalculation();
        area.calculateArea(c);
        area.calculateArea(a);
        area.calculateArea(a,b);

    }

    public void calculateArea(double a) {
        System.out.println("Area of circle is " + (Math.PI * a * a));
    }

    public void calculateArea(int a) {
        System.out.println("Area of square is " + (a * a));
    }

    public void calculateArea(int a, int b) {
        System.out.println("Area of rectangle is " + (a * b));
    }
}
