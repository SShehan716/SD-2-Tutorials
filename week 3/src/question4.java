public class question4 {
    public static void main(String[]args){
        int x = 2;
        int y = 5;
        int z = 0;

            // 1
        if (x == 2){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

            // 2
        if ( x != 5){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

            // 3
        if (x != 5 && y >= 5){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

            // 4
        if ( z != 0 || x == 2){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

             // 5
        if ( !(y < 10)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
