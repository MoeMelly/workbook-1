import javax.swing.*;
import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Melchi's Name Generator!");

        String first = "John";
        String middle = "Max";
        String last = "Doe";
        String suffix = " mel";

        System.out.println("Please Enter First Name: ");
        String userFirst = input.nextLine();
        if (!userFirst.isEmpty()) {
            first = userFirst;

            System.out.println("Proud Father ...now Enter your last name lil bro:");
            String userMiddle = input.nextLine();
            if(!userMiddle.isEmpty()) {
                middle = userMiddle;

                System.out.println("Good boy, now Enter Middle Name");
                String userLast = input.nextLine();
                if(!userLast.isEmpty())
                {
                    last = userLast;



                    System.out.println("Would you like to add a Suffix?");

                    String answer = input.nextLine();
                    if (answer.equalsIgnoreCase("yes")) {
                        System.out.println("Enter your suffix:");
                        suffix = " " + input.nextLine();
                    } else {
                        System.out.println("Aww That Sucks...Just Kidding lol!");
                    }




                    System.out.println("Did you have fun using the tool?");
                    String answerExit= input.nextLine();
                    if (answer.equalsIgnoreCase("yes")) {
                        System.out.println("Thank you for your kind words!");
                    } else {
                        System.out.println("Fuck you and Fuck Off!");



                    }

                    String fullName = first + " " + middle + " " + last + suffix;

                    System.out.println("Your full name is:" + fullName);




                }









                }

            }
        }


    }

