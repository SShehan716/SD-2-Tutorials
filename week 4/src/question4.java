import java.util.*;

public class question4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fibonacci series count : ");
        int LastNumber = input.nextInt();
        int count = 1;
        int var1 = 0;
        int var2 = 1;

        while(count<LastNumber){
            System.out.print(var2 + ", ");
            int varNext = var1 +var2;
            var1 = var2;
            var2 = varNext;

            count++;

        }
    }
}
