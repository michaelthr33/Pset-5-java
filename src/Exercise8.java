import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        int Value = in.nextInt();
        String Measure = in.next();
        String Matter = "";
        System.out.println();

        if(Measure.contains("F")||Measure.contains("f")){
            if(Value >32 && Value <= 212){
                Matter = "Liquid.";
            }else if(Value <= 32){
                Matter = "Solid.";
            } else if(Value >=212){
                Matter = "Gas.";
            }

        } else if (Measure.contains("C")||Measure.contains("c")){
            if(Value <= 0){
                Matter = "Solid.";
            } else if(Value > 0 && Value <=100){
                Matter = "Liquid.";
            } else if(Value > 100){
                Matter = "Gas.";
            }
        } else{
            Matter = "That's not a valid scale.";
        }
        System.out.print(Matter);

        System.out.println();
    }
}