import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        String Temperature = in.nextLine();
        int Length = Temperature.length();
        String Temp = Temperature.substring(0,Length);
        Double Value = Double.valueOf(Temp);
        String Matter = "";

        if(TemperatureScale.contains("F")||TemperatureScale.contains("f")){
            Temperature.indexOf(F)
            if(Value >32 && Value <= 212){
                Matter = "Liquid.";
            }else if(Value <= 32){
                Matter = "Solid.";
            } else if(Value >=212){
                Matter = "Gas.";
            }

        } else if (TemperatureScale.contains("C")||TemperatureScale.contains("c")){
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
        System.out.println(Matter);

        System.out.println();
    }
}