import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int Integer = in.nextInt();
        boolean Even = (Integer % 2 == 0);
        System.out.println();
        if(Even){
            System.out.println("Even.");
        } else {
            System.out.println("Odd.");
        }
        System.out.println();
    }
}
