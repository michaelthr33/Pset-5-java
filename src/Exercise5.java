import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal = new DecimalFormat("#.##");
        System.out.print("Enter a grade: ");
        double NumGrade = in.nextDouble();
        System.out.println();
        //added line spacing


        if (NumGrade >= 89.5 && NumGrade <= 100) {
            System.out.println("You received an A.");
        } else if (NumGrade > 79.5 && NumGrade < 89.5) {
            System.out.println("You received a B.");
        } else if (NumGrade >= 69.5 && NumGrade<79.5){
            System.out.println("Your received a C");
        } else if (NumGrade >= 59.5 && NumGrade < 69.5){
            System.out.println("You received a D");
        } else if (NumGrade >= 0 && NumGrade < 59.5  ){
            System.out.println("You received a F.");
        } else {
            System.out.println("That's not a valid grade.");
        }

        System.out.println();
    }
}