import java.util.Scanner;


public class Parser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the parser name thingy idk....");
        System.out.println();
        System.out.println("Please enter Your Full Name:");
        System.out.println();
        String fullName = scanner.nextLine();
        String[] nameParting = fullName.split(",");
        System.out.println("[Your New Name format: " +  fullName + "]");



    }

}
