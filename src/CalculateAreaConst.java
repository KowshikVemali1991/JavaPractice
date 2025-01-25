import java.sql.SQLOutput;

public class CalculateAreaConst {
    public static void main(String[] args) {
        int a = 20, b = 30;
        double c = 30;
        CalculateAreaConst square = new CalculateAreaConst(a);
        CalculateAreaConst rectangle = new CalculateAreaConst(a, b);
        CalculateAreaConst circle = new CalculateAreaConst(c);

    }

    public CalculateAreaConst(int a) {
        System.out.println("The area of Square is " + a * a);
    }

    public CalculateAreaConst(int a, int b) {
        System.out.println("The area of Rectangle is " + a * b);
    }

    public CalculateAreaConst(double c) {
        System.out.println("The area of Circle " + (Math.PI * c * c));
    }
}
