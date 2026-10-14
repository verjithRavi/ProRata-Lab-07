import java.util.Scanner;

public class IT23245938Lab7Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nCustomer " + i);

            System.out.print("Enter Total Bill Amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter Payment Mode (C/c for Cash, O/o for Other): ");
            char mode = input.next().charAt(0);

            double discount = 0;
            double finalAmount = bill;

            if (mode == 'C' || mode == 'c') {

                discount = bill * 0.05;
                finalAmount = bill - discount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to be Paid: " + finalAmount);

            } 
            else if (mode == 'O' || mode == 'o') {

                System.out.println("No Discount Applied");
                System.out.println("Amount to be Paid: " + bill);

            } 
            else {
                System.out.println("Payment Mode is Not Valid");
            }
        }

        input.close();
    }
}