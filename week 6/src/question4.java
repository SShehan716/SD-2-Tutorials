import java.util.*;
public class question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int [5];


        for (int i = 0; i <5 ; i++){
            array1[i] = input.nextInt();
            array2[i] = array1[i];
        }
        int tempArray = array1[4];

        for (int i = 0 ; i <5 ; i++){

            if (i!=4){
                array1[i+1] = array2[i];
            }
            else{
                break;
            }

        }
        array1[0] = tempArray;

        for (int j =0;j <5;j++ ){
            System.out.print(array1[j] + " ");
        }

    }
}
