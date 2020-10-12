import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String Month = in.next();
        Month = Month.toLowerCase();
        System.out.println();


        if (Month.equals("january") || Month.equals("jan") || Month.equals("janu") || Month.equals("march") || Month.equals("mar") || Month.equals("marc") || Month.equals("may") || Month.equals("july") || Month.equals("jul") || Month.equals("august") || Month.equals("aug") || Month.equals("augu") || Month.equals("october") || Month.equals("oct") || Month.equals("octo") || Month.equals("december") || Month.equals("dec") || Month.equals("dece")) {
            System.out.println("31 days.");
        } else if (Month=="september"||Month=="sept"||Month=="sep"||Month=="april"||Month=="apr"||Month=="apri"||Month=="june"||Month=="jun"||Month=="november"||Month== "nov"||Month == "nove") {
            System.out.println("30 days.");
        } else if (Month=="february"||Month=="feb"||Month=="febu"){
            System.out.println("28 or 29 days.");
        } else {
            System.out.println("That's not a valid month.");
        }
        System.out.println();
    }
}