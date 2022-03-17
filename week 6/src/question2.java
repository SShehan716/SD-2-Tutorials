import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] mark = new double[10];
        for (int i = 0; i < mark.length; i++) {
            System.out.print("Enter the mark : ");
            mark[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(MarksMaker(mark)));

    }
    private static double[] MarksMaker(double[] marks) {
        double[] NewMark = new double[10];
        for (int i = 0; i < marks.length; i++) {
            NewMark[i] = marks[i] * 90 / 100;
        }
        return NewMark;
    }
}