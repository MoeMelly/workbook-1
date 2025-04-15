import javax.swing.*;

public class Mosh {
    public static void main(String[] args) {

        double equation = 13 % 5;

        System.out.println(equation);

        int someValue = 5; //prefix

        System.out.println(++someValue);


        int someOtherValue = 5;
        System.out.println(someOtherValue++); //postfix occurs after print
        System.out.println(someOtherValue);

        int myOtherValue = 90; //Compoud assingment in action
        int val1 = 6;
        int val3 = 10;

        myOtherValue -= val1 + val3;

        System.out.println(myOtherValue);


        int valA = 23;   //Operator precedence
        int valB = 5;
        int valC = 4;
        int valF = 7;

        int result1 = valA + valF / valC;
        int result2 = (valA - valF) / valC;

        System.out.println(result1);
        System.out.println(result2);


        int intValueOne = 50;
        long longValueOne = intValueOne; //implicit is auto.

        long longValueTwo = 50;
                int intValueTwo = (int) longValueTwo; //explicit is manuel



        float floatVal = 1.0f;            //explicit examples
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short part1 = (short) doubleVal;
        short part2 = (short) (floatVal - longVal);


        System.out.println("Success");


        int num1 = 12;
        int num2 = 14;
    //If else
        if (12 >= 14) {
            System.out.println("num1 is bigger");
        } else {
            System.out.println("num1 is not bigger");



            double carPrice = 1000000;
            double carMileage = 100000;

            switch ('a') {}

            case 'a':
                carPrice > 1000000
            {
                System.out.println("You can buy this car");
            } case 'b' :
                boolean b = carMileage > 100000;
            {
                System.out.println("You can drive this car");
            } else {
                System.out.println("You can't drive this car");

            }

        }




    }
}
