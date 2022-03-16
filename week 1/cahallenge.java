import java.text.NumberFormat;
import java.util.Locale;

public class cahallenge {
    public static void main(String[]args){

        double number = 1234567.456;

        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        System.out.println(defaultFormat.format(number));


    }
}
