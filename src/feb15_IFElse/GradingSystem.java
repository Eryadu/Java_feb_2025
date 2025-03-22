package feb15_IFElse;

public class GradingSystem {
    public static void main(String[] args) {
         int marks = 90;
         if (marks > 90 && marks <= 100) {
             System.out.println("Grade is A+.");
         }
        else if (marks > 80 && marks <= 90) {
            System.out.println("Grade is A.");
        }
        else if (marks > 70 && marks <= 80) {
            System.out.println("Grade is B+.");
        }
        else if (marks > 60 && marks <= 70) {
            System.out.println("Grade is B.");
        }
        else if (marks > 50 && marks <= 60) {
            System.out.println("Grade is C+.");
        }
        else if (marks >= 40 && marks <= 50) {
            System.out.println("Grade is C.");
        }
        else
            System.out.println("Fail.");
    }
}
