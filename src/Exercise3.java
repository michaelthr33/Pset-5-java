import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three integers.");
        System.out.println();
        System.out.print("Enter integer: ");
        double IntOne = in.nextDouble();
        System.out.print("Enter integer: ");
        double IntTwo = in.nextDouble();
        System.out.print("Enter integer: ");
        double IntThree = in.nextDouble();
        System.out.println();

        if (IntOne > IntTwo && IntTwo > IntThree) {
            System.out.println("Strictly decreasing.");
        } else if (IntOne < IntTwo && IntTwo < IntThree) {
            System.out.println("Strictly increasing.");
        } else if (IntOne == IntTwo && IntTwo == IntThree){
            System.out.println("Same.");
        } else if (IntOne <= IntTwo && IntTwo <= IntThree){
            System.out.println("Increasing.");
        } else if (IntOne >= IntTwo && IntTwo >= IntThree){
            System.out.println("Decreasing.");
        } else {
            System.out.println("Unordered.");
        }

        System.out.println();
    }
}