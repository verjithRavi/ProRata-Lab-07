import java.util.Scanner;

public class IT23245938Lab7Q1A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input marks for 4 subjects
        System.out.print("Enter Subject 1 Mark: ");
        double mark1 = input.nextDouble();

        System.out.print("Enter Subject 2 Mark: ");
        double mark2 = input.nextDouble();

        System.out.print("Enter Subject 3 Mark: ");
        double mark3 = input.nextDouble();

        System.out.print("Enter Subject 4 Mark: ");
        double mark4 = input.nextDouble();

        // Calculate average
        double average = (mark1 + mark2 + mark3 + mark4) / 4;

        // Determine grade
        String grade;

        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        // Display results
        System.out.println("\nAverage Mark: " + average);
        System.out.println("Grade: " + grade);

        input.close();
    }
}