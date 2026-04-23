import java.util.Scanner;

public class Grading {

    public static void main(String[] args) {
        int marks = inputer();
        grade(marks);
    }

    public static int inputer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Marks here:");
        int marks = input.nextInt();
        input.close();
        return marks;

    }

    public static void grade(int marks) {
        if (marks < 70) {
            System.out.println("Your Grade is B");
        } else {
            System.out.println("Your grade is A");
        }
    }
}