import java.util.*;

public class question5 {
    public static int factoria(int fact){
        int factorial, total = 1;
        int count = 0;
        while (count < fact ){
            count ++;
            factorial = total * count;
            total = factorial;
        }
        return total;
    }

    public static void main(String[] args) {
        int number,total;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        number = input.nextInt();
        total = factoria(number);


        System.out.println("the factorial is " + total);
    }
}