import java.util.*;

public class question6 {
    public static void main(String[] args)
    {
        int number, power, count;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        number = input.nextInt();
        System.out.println("Enter power :");
        power = input.nextInt();
        count = 0;
        while (count < power )
        {
            count++;
            total = total * number;
        }
        System.out.println(" the answer is " + total);
    }
}
