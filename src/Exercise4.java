import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal = new DecimalFormat("#.##");
        System.out.print("Enter a letter grade: ");
        String LetterGrade = in.next();
        String F = "F";
        String DMinus = "D-";
        String D = "D";
        String DPlus = "D+";
        String CMinus = "C-";
        String C = "C";
        String CPlus = "C+";
        String BMinus  = "B-";
        String B = "B";
        String BPlus = "B+";
        String AMinus = "A-";
        String A = "A";
        String APlus = "A+";
        System.out.println();


        if (LetterGrade.equals(F) || LetterGrade.equals(F.toLowerCase())) {
            System.out.println("Your GPA is 0.00.");
        } else if (LetterGrade.equals(DMinus) || LetterGrade.equals(DMinus.toLowerCase())) {
            System.out.println("Your GPA is 0.67.");
        } else if (LetterGrade.equals(D) || LetterGrade.equals(D.toLowerCase())){
            System.out.println("Your GPA is 1.00.");
        } else if (LetterGrade.equals(DPlus) || LetterGrade.equals(DPlus.toLowerCase())){
            System.out.println("Your GPA is 1.33.");
        } else if (LetterGrade.equals(CMinus) || LetterGrade.equals(CMinus.toLowerCase())){
            System.out.println("Your GPA is 1.67.");
        } else if (LetterGrade.equals(C) || LetterGrade.equals(C.toLowerCase())){
            System.out.println("Your GPA is 2.00.");
        } else if (LetterGrade.equals(CPlus) || LetterGrade.equals(CPlus.toLowerCase())){
            System.out.println("Your GPA is 2.33.");
        } else if (LetterGrade.equals(BMinus) || LetterGrade.equals(BMinus.toLowerCase())){
            System.out.println("Your GPA is 2.67");
        } else if (LetterGrade.equals(B) || LetterGrade.equals(B.toLowerCase())){
            System.out.println("Your GPA is 3.00.");
        } else if (LetterGrade.equals(BPlus) || LetterGrade.equals(BPlus.toLowerCase())){
            System.out.println("Your GPA is 3.33.");
        } else if (LetterGrade.equals(AMinus) || LetterGrade.equals(AMinus.toLowerCase())){
            System.out.println("Your GPA is 3.67.");
        } else if (LetterGrade.equals(A) || LetterGrade.equals(A.toLowerCase())){
            System.out.println("Your GPA is 4.00.");
        } else if (LetterGrade.equals(APlus) || LetterGrade.equals(APlus.toLowerCase())){
            System.out.println("Your GPA is 4.33.");
        } else{
            System.out.println("That's not a valid letter grade.");
        }

        System.out.println();
    }
}