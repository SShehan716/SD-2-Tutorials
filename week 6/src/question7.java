import java.util.*;

public class question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myNameArray = new int[10];
        System.out.println("Keep entering 10 ints : ");
        for (int i = 0; i <10 ; i ++){
            myNameArray[i] = input.nextInt();
        }
        int [] myNameArrayList = new int[10];

        System.arraycopy(myNameArray, 0, myNameArrayList, 0, myNameArray.length);
        Arrays.sort(myNameArrayList);
        for (int i = 0; i <10; i++){
            System.out.print(myNameArrayList[i] + " ");
        }
    }
}
