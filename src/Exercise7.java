import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int Year = in.nextInt();
        double FirstTest = Year%4;
        double SecondTest = Year%10;
        double ThirdTest = Year%400;
        String Leap = "";
        System.out.println();


        if (FirstTest == 0 && SecondTest != 0) {
            Leap = " is a leap year.";
        } else if (ThirdTest == 0) {
            Leap = " is a leap year.";
        } else {
            Leap = " is not a leap year.";
        }
        System.out.println(Year + Leap);


        System.out.println();
    }
}