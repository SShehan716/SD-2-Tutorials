import java.util.*;

public class question1 {
    public static void main(String[] args){
        System.out.print("Enter temperature : ");
        Scanner input1 = new Scanner(System.in);
        double temp = input1.nextDouble();
        if(temp>40){
            System.out.print("Hot");
        } else {
            System.out.print("Cool");
        }

    }
}
