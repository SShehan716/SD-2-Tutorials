import java.util.*;

public class question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numberArray = new double[100];
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print("Enter the number : ");
            numberArray[i] = input.nextDouble();
        }
        System.out.println(MaxFinder(numberArray));
    }

    private static double MaxFinder(double[] num) {
        double Max = num[0];
        for (int i=1; i<num.length; i++) {
            if (num[i] > Max) {
                Max = num[i];
            }
        }
        return Max;
    }
}