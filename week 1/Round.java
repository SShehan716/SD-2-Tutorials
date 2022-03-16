import java.util.Scanner;

public class Round {
    public static void main(String[]args){
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        double v1 = input.nextDouble();

        double v2 = Math.round(v1*100.0)/100.0;
        System.out.print("Rounded value : " + v2);

    }
}
