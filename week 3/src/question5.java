import java.util.Scanner;

public class question5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char val = input.next().charAt(0);
        if (Character.isUpperCase(val)) {
            System.out.println("Character is in Uppercase!");
        }else {
            System.out.println("Character is in Lowercase!");
        }
    }
}
