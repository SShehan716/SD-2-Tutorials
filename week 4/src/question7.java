import java.util.*;
public class question7
{
    public static void main(String[] args) {
        int number, count, factorial;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        number = input.nextInt();
        count = 0;
        while (count < number )
        {
            count ++;
            factorial = total * count;
            total = factorial;
        }
        System.out.println("the factorial is " + total);
    }
}