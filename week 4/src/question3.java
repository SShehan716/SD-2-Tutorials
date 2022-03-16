/*
Enter a number : 5
Enter a letter : Y
output : YYYYY
*/

import java.util.*;

public class question3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int count = input.nextInt();
        System.out.print("Enter a letter : ");
        char letter = input.next().charAt(0);
        while(count>0){
            System.out.print(letter);
            count--;

        }

    }
}
