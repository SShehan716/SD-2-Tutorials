import java.util.*;

public class BoxVolume {
    public static void main(String[]args){
        Scanner inputData = new Scanner(System.in);
        System.out.print("Length of the box : ");
        int length = inputData.nextInt();
        System.out.print("Height of the box : ");
        int height = inputData.nextInt();
        System.out.print("Width of the box : ");
        int width = inputData.nextInt();
        System.out.println("volume of the box is " + length * height * width);

    }
}
