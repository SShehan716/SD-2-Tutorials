import java.util.*;

public class question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] mark = new double[10];
        int count = 0;
        for (int i = 0; i < mark.length; i++) {
            System.out.print("Enter the mark : ");
            mark[i] = input.nextDouble();
        }
        System.out.println(FailCounter(mark,count));

    }
    private static int FailCounter(double[] marks, int fail_count) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 40) {
                fail_count += 1;
            }
        }
        return fail_count;
    }
}