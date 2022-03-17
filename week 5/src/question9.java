import java.util.Scanner;

public class question9{
    static int factoria(int fact){
        if (fact == 0)
            return 1;
        else
            return(fact * factoria(fact-1));
    }
    public static void main(String[] args){
        int factorial=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        factorial = factoria(number);
        System.out.print(factorial);
    }
}  