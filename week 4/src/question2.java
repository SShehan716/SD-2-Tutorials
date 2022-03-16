import java.util.*;

public class question2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Start value : ");
        int number1 = input.nextInt();
        System.out.print("Enter Start value : ");
        int number2 = input.nextInt();

        if(number1<number2){
            for(int no = number1+1;no < number2;no++){
                System.out.println(no);
            }
        }else{
            System.out.print("Wrong Input");
        }
    }
}
