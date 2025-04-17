import java.util.Scanner;

public class NumbersLesson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);






        //Math operations
        double gradeExam = 90.4;
        double exam2 = 100.0;
        double exam3 = 75.09;

        System.out.println("Grading System".toUpperCase());
        System.out.println();
        System.out.print("Enter your grade for exam 1: ");
        System.out.println();
        double gradeExam1 = scanner.nextDouble();
        System.out.println();
        System.out.print("Enter Grade for exam 2: ");
        System.out.println();
        double gradeExam2 = scanner.nextDouble();
        System.out.print("Enter grade for exam 3: ");
        double gradeexam3 = scanner.nextDouble();
        double gradeAverage = (gradeExam + exam2 + exam3) / 3;
        String formattingAvg = String.format("%.2f" , gradeAverage);
        System.out.println("New Grade: " + formattingAvg);



        //Casting Conversions













    }
}
