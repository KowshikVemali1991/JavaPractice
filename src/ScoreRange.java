public class ScoreRange {
    public static void main(String[] args) {
        int marks = 81;
        if (marks >= 50 && marks < 70) {
            System.out.println("You qualified the exam with grade C");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("You qualified the exam with grade B");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("You qualified the exam with grade A");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("You qualified the exam in distinction");
        } else {
            System.out.println("You failed the exam");
        }
    }
}

