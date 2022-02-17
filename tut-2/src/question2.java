import java.util.Scanner;

public class question2 {
    public static void main(String[]args){
        System.out.print("Enter age : ");
        Scanner input1 = new Scanner(System.in);
        int age = input1.nextInt();
        if ((age < 17 ) || (age > 150)){
            System.out.print("don't drive");
        }
    }
}
