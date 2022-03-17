import java.util.Scanner;

public class question10{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number_str = input.next();

        number_str = number_str.replaceAll(",", "");

        int number = Integer.parseInt(number_str);

        if(isPalindrome(number))
        {
            System.out.println("This is palindrome");
        }
        else
        {
            System.out.println("This is not palindrome");
        }
    }

    public static boolean isPalindrome(int number)
    {
        int skip = number;
        int rem;
        int res = 0;

        while(skip > 0)
        {
            rem = skip % 10;
            skip = skip / 10;
            res = res * 10 + rem;
        }
        return res == number;
    }
}