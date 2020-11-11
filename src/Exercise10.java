import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        DecimalFormat Decimal = new DecimalFormat("#.##");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter wage: ");
        double Wage = in.nextDouble();
        System.out.print("Enter hours worked: ");
        double Hours = in.nextDouble();
        double Overtime =Hours - 40;
        Overtime = Overtime*Wage*1.5;
        double MaxRegularHours = Wage*40;
        double Earnings = 0;

        System.out.println();

        if (Hours>40) {
            Earnings = Overtime+MaxRegularHours;
        } else if (Hours<=40) {
            Earnings = Wage*Hours;
        }

        if(Hours<0){
            System.out.println("Your hours must be greater than or equal to 0.0.");
        } else if(Wage<0){
            System.out.println("Your wage must be greater than or equal to $0.00/hour");
        } else{
            System.out.println("You'll make $"+Decimal.format(Earnings)+" this week.");
        }
//included decimal.format

    }
}