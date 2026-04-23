import java.util.Scanner;

public class Grading {

    public static void main(String[] args) {
        inputer();
        grade();
    }

    public static void inputer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Marks here:");
        int marks = input.nextInt();
    }

    public static void grade(marks) {
        if (marks < 70) {
            System.out.println("Your Grade is B");
        } else {
            System.out.println("Your grade is A");
        }
    }
}