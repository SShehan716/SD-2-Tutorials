import java.util.Scanner;

public class question10 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month : ");
        String month = input.nextLine();
        switch (month) {
            case "January":
            case "May":
            case "March":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31");
                break;
            case "February":
                System.out.println("28 or 29");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30");
                break;
        }
    }
}
