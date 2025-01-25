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
        System.out.println("Area af circle is " + (Math.PI * a * a));
    }

    public void calculateArea(int a) {
        System.out.println("Area af square is " + (a * a));
    }

    public void calculateArea(int a, int b) {
        System.out.println("Area af rectangle is " + (a * b));
    }
}
