import java.util.Scanner;



public class VehicleInsurance {
    public static void main(String[] args) {
        System.out.println("Hello, and Welcome to Melchi's Automotive!");
        System.out.println("Enter your Vehicle type: ");
        System.out.println("Car, Truck, Bus, Motorcycle");
        Scanner scan = new Scanner(System.in); //User Input
        String type = scan.nextLine();// variable is used to store information/refrence from string obtained



        int premium = 0; // 0 is used to store amount entered later
        switch(type) {      // switches and cases are used like your giving java a menu

            case "car":
                System.out.println("Select Vehicle type: ");
                System.out.println("Sedan, Coupe, Hatchback, Sport, Sports Sedan");//if user input is car and break is used to leave switch conditonal.
                premium = 200;
                break;
            case "Truck":
                premium = 300;
                break;
            case "Bus":
                premium = 550;
                break;
            case "motorcycle":
                System.out.println("Select Motorcycle type: ");
                System.out.println("1 (Cruiser),2 (Chopper),3 (Sport bike),4 (Standard)");
                String motorCycle = scan.nextLine();
                int motorcycleInt = Integer.parseInt(motorCycle);
                switch (motorcycleInt) {

                    case 1:
                        premium = 300;
                        break;
                    case 2:
                        premium = 400;
                        break;
                    case 3:
                        premium = 500;
                        break;
                    case 4:
                        premium = 600;
                        break;
                    default:
                        System.out.println("Unknown motorcycle type");

                }
                break;
            default:
                System.out.println("Unknown vehicle type");
        }
             scan.close();
        System.out.println("The premium is $" + premium);




        }














    }










