public class CharWithChar {
    public static void main(String[] args) {
        int a=20, b=30;
        char ch = '/';
        switch(ch){
            case '+':
                System.out.println("Addition of a=" +a +" and b=" +b + " is " +(a+b));
                break;
            case '-':
                System.out.println("Subtraction of a=" +a +" and b=" +b + " is " +(a-b));
                break;
            default:
                System.out.println("Invalid character");
        }
    }
}
