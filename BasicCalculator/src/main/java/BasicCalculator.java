import java.util.Scanner;



public class BasicCalculator {

    public static void main(String[] args) {
        Scanner melchiScanner;
        melchiScanner = new Scanner(System.in);
        String userInput;

        System.out.println("Enter first number:");
        userInput = melchiScanner.nextLine();
        double firstNumber = Double.parseDouble();

        System.out.println(userInput);
    }


}
