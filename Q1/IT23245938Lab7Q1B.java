import java.util.Scanner;

public class IT23245938Lab7Q1B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {

            System.out.println("\nEnter 4 subject marks for Student "
                    + student + " (separated by spaces):");

            double mark1 = input.nextDouble();
            double mark2 = input.nextDouble();
            double mark3 = input.nextDouble();
            double mark4 = input.nextDouble();

            double average = (mark1 + mark2 + mark3 + mark4) / 4;

            String grade;

            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average Mark: " + average);
            System.out.println("Grade: " + grade);
        }

        input.close();
    }
}