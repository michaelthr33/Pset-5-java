import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int Integer = in.nextInt();

        System.out.println();
        if(Integer < 0){
            System.out.println("Negative.");
        }

        if(Integer > 0){
            System.out.println("Positive.");

        }

        if(Integer == 0){
            System.out.println("Zero.");

        }

        System.out.println();
    }
}
