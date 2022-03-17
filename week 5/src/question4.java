import java.util.*;

class question4{

    private static int multiply(int value){
        return value*value;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int val = input.nextInt();
        int multiplied_value = multiply(val);
        System.out.print(multiplied_value);
    }
}