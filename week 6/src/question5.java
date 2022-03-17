import java.util.*;
public class question5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] Array = new double[20];


        for (int i = 0; i < Array.length; i++) {
            System.out.print("Enter the number : ");
            Array[i] = input.nextDouble();
        }


        for (int j = 0; j <20 ;j++ ){
            System.out.print(Array[j] + " ");
        }
        System.out.println();

        System.out.println("Enter 1st position : ");
        int x = input.nextInt();
        System.out.println("Enter 2nd position : ");
        int y = input.nextInt();

        double tempArray;

        tempArray = Array[x-1];

        Array[x-1] = Array[y-1];

        Array[y-1] = tempArray;

        for (int i = 0; i <20;i++){
            System.out.print(Array[i] + " ");
        }


    }
}
