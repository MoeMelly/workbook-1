

public class Calculator {
    public static void main(String[] args) {

        double value1 = 150d;
        double value2 = 70d;
        double result = 0.0d;

        char opCode = 'd';

        if (opCode == 'a')  //if else statements
            result = value1 + value2;
        else if (opCode == 's')
            result = value1 - value2;
        else if (opCode == 'd')
            result = value1 * value2;
        else if (opCode == 'b')
            result = value1 / value2;
        else
            result = 0.0d; //resolves to result dependent on operation so 0.


        System.out.println(result);


        }






    }
