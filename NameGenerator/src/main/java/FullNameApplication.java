import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();

        String firstName = "Melchi Lamb";
        String fullName = firstName + " " + lastName;
        System.out.println("Your full name is: "+ fullName);

        



    }
}
