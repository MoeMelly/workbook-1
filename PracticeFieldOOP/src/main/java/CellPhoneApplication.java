import java.util.Scanner;


public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhoneService phone = new CellPhoneService();
        System.out.println("Enter the Serial number (10000000-9999999): ");
        phone.setSerialNumber((scanner.nextLong()));
        scanner.nextLine();
        System.out.println();

        System.out.println("Enter the phone model(ex.,iPhone 14): ");
        phone.setModel(scanner.nextLine());
        System.out.println();


        System.out.println("Enter the carrier(e.g., AT&T): ");
        phone.setCarrier(scanner.nextLine());
        System.out.println();

        System.out.println("Enter the phone number(ex: 800-555-8764): ");
        phone.setPhoneNumber(scanner.nextLong());
        System.out.println();


        System.out.println("Enter owner's name: ");
        phone.setOwner(scanner.nextLine());
        System.out.println();
        System.out.println();


        System.out.println("Phone information");
        System.out.print("Serial Number: " + phone.getSerialNumber());
        System.out.print("Model:" + phone.getModel().toUpperCase());
        System.out.print("Service Carrier:" + phone.getCarrier().toUpperCase());
        System.out.println("Enter the Phone Number: " + phone.getPhoneNumber());
        System.out.println("Enter Owner's name: " + phone.getOwner().toUpperCase());



    }
}
