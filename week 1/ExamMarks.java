import java.util.*;

public class ExamMarks {
    public static void main(String[]args){
        System.out.print("Enter mark 1: ");
        Scanner markInput = new Scanner(System.in);
        double mark1 = markInput.nextDouble();
        System.out.print("Enter mark 2: ");
        double mark2 = markInput.nextDouble();
        System.out.print("Enter mark 3: ");
        double mark3 = markInput.nextDouble();
        double avg = (mark1 + mark2 + mark3)/3;

        System.out.println("Your average is " + avg);
    }
}
