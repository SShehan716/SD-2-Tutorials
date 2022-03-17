import java.util.*;
public class question6 {

    public static void main(String[] args) {

        double[] Array = {12.5,2.4,3.6,4.8,2.3,4.5,3.0,2.6,7.8,9.67,3.4,4.0,3.4,1.2,1.5,2.8,6.5,3.5,2.3,6.7};
        for (int j = 0; j <20 ;j++ ){
            System.out.print(Array[j] + " ");
        }
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st position : ");
        int x = input.nextInt();
        System.out.println("Enter 2nd position : ");
        int y = input.nextInt();

        swap(x,y);

    }
    public static void swap(int x , int y){
        double TampArray;
        double[] Array = {12.5,2.4,3.6,4.8,2.3,4.5,3.0,2.6,7.8,9.67,3.4,4.0,3.4,1.2,1.5,2.8,6.5,3.5,2.3,6.7};
        TampArray = Array[x-1];
        Array[x-1] = Array[y-1];

        Array[y-1] = TampArray;

        for (int i = 0; i <20;i++){
            System.out.print(Array[i] + " ");
        }
    }
}
