import com.sun.jdi.ShortValue;

import java.util.Scanner;

public class GettingRight {

    private static String x;

    //Using scanner and .upper and lower case
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welocme to my Playground for coding practice!".toUpperCase());
        System.out.println();


        System.out.println();
        System.out.println("Enjoy coding friend! " .toUpperCase());
        System.out.println();




      //Setting Min and max value(Use numbers within range otherwise errors occur
        byte Hi = 123;
        short num = 14000;
        int countNum = 230985;
        long distanceWalked = 63462536L;

        System.out.println("byte: min value=" +Byte.MIN_VALUE);
        System.out.println("byte: max value=" +Byte.MAX_VALUE);
        System.out.println("short: min value=" +Short.MIN_VALUE);
        System.out.println("short: max value=" +Short.MAX_VALUE);

        //Floats, doubles...
        float intrestRate = 8.91f;
        double prizeWinning = 928367378.9; //scientfic e notation
        String formattedNum = String.format("%.2f" , prizeWinning);
        System.out.println("Updated Score: " + formattedNum);

        System.out.println("IntrestRate= " + intrestRate);
        System.out.println(("PrizeWinning= " + prizeWinning));

       //Char
        char firstI = 'M';

        String name = "is";

        //boolean true or false
        boolean alive = true;
        boolean hateCoding = false;

        //Math operations

        double gradeExam = 90.4;
        double exam2 = 100.0;
        double exam3 = 75.09;


        double gradeAverage = (gradeExam + exam2 + exam3) / 3;


        System.out.println(gradeAverage);
        String formattingAvg = String.format("%.2f" , gradeAverage);
        System.out.println("New Grade: " + formattingAvg);



















    }
}
