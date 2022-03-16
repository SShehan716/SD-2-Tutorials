import java.util.*;

public class TempConvertor {
    public static void main(String[]args){
        //F = (9.0/5)*C + 32
        Scanner input = new Scanner(System.in);
        System.out.print("Centigrade : ");
        double centigrade = input.nextDouble();
        System.out.println(centigrade +" in fahrenheit : " + ((9.0/5) * centigrade + 32));


    }
}
