import java.util.Scanner;

public class MortageCalculator {

    public static void main(String[] args) {

        System.out.println("Melchi's Mortage Calculator");
        Scanner input = new Scanner(System.in);


        String fullName;   //variables used for while loop.
        String answerIn;


        while (true) {
            System.out.println("Enter your full name:");
            fullName = input.nextLine();


            System.out.println("You entered: " + fullName);  //Created confrimation input after entering name so that it doesn't give invalid input!
            System.out.println("Is this correct? (Y/N):");
            String confirmation = input.nextLine();

            if (confirmation.equalsIgnoreCase("Y")) {
                System.out.println("Confirmed.");
                break;
            } else if (confirmation.equalsIgnoreCase("N")) {
                System.out.println("Cancelled. Let's try again.");
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }




            if (input.equals("Y")) {
                System.out.println("Confirmed.");
                break; // Exit the loop and move on
            } else if (input.equals("N")) {
                System.out.println("Cancelled.");
                break; // Exit the loop and maybe stop or go back
            } else {
                System.out.println("Invalid input. Please enter Y or N.");

            }
        }

        System.out.println("Enter loan amount (principal): ");
        double principal = input.nextDouble();

        System.out.println("Enter annual intrest rate(in %): ");
        double annualRate = input.nextDouble();

        System.out.println("Enter loan term (in years): ");
        int years = input.nextInt();

        //M=P×(i*(1+i)^n / ((1+i)^n)-1

        double p = principal;
        double r = annualRate / 100;
        double i = r / 12;
        double n = 12 * years;
        double v = (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);

        double monthlyPayment = principal * v;
        double totalPaid = monthlyPayment * v;
        double totalIntrest = totalPaid - principal;


        System.out.println("Your Expected Monthly Payment and Total Intrest Paid: " + monthlyPayment);
        System.out.println("Total intrest paid  " +   years  +  "Years "  +  totalIntrest);
    }

}