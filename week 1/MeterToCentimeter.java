import java.util.*;

public class MeterToCentimeter {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print ("Enter meter value : ");
        double meters = input.nextDouble();

        System.out.println(meters * 100 + "cm");

    }

}
