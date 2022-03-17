public class question6 {
    //swaps parameter names around in function call
    private static void mixup(int b, int c, int a ) {
        a = b + c - a;
        System.out.println(a + " " + c);
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 4;
        mixup(a, b, 3);
    }

}

// output --> 4 5