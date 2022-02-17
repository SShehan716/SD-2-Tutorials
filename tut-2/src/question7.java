import java.util.Scanner;

public class question7 {
    public static void main(String[]args){
        //program A
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int x = S.nextInt();
        if (x > 0) {
            System.out.println("The value is positive:");
        }
        else {
            if (x < 0) {
                System.out.println("The value is negative:");
            }
            else {
                System.out.println("The value is zero:");
            }
        }
        System.out.println("Good Bye!");


        //Program C
        if (x > 0) {
            System.out.println("The value is positive:");
        }
        if (x < 0) {
            System.out.println("The value is negative:");
        }
        if (x ==0) {
            System.out.println("The value is zero:");
        }
        System.out.println("Good Bye!");

        //Program B - This one is different
        if (x > 0) {
            System.out.println("The value is positive:");
        }
        if (x < 0) {
            System.out.println("The value is negative:");
        }
        else {
            System.out.println("The value is zero:");
        }
        System.out.println("Good Bye!");

    }
}
