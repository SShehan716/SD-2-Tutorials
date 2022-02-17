import java.util.Scanner;

    public class question3 {
        public static void main(String[] args) {
            System.out.print("Enter marks : ");
            Scanner input1 = new Scanner(System.in);
            int marks = input1.nextInt();
            if (marks>=80){
                System.out.print("A");
            }else if(marks>=60){
                System.out.print("B");
            }else if(marks>=50){
                System.out.print("C");
            }else if(marks>=45){
                System.out.print("D");
            }else if(marks>=25){
                System.out.print("E");
            }else{
                System.out.print("F");
            }

        }
}
