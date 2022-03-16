import java.util.*;

public class question5 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.print("Enter rows count : ");
       int rows = input.nextInt();

       for(int i=0; i<=rows;i++){
           for(int k=0; k<i;k++){
               System.out.print("* ");
           }
           System.out.println();

       }System.out.println("---------------------------------------------------------");

        int count = 0;
        for(int i = rows; i>=0; i--){
            for(int h=0; h<=count; h++){
                System.out.print(" ");
            }count = count+1;
            for(int k=0; k<i; k++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}
