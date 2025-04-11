import java.util.Scanner;


public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();
        System.out.println("Enter hours worked: ");
        double hoursWorked = Double.parseDouble(scanner.nextLine());
        System.out.println("Pay rate per hour: ");
        double payRate = Double.parseDouble(scanner.nextLine());

        double grossPay = 0.0;
        grossPay = hoursWorked * payRate;
        System.out.println("Gross Pay: $" + grossPay);


    }






        }





















