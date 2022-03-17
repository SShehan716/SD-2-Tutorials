public class question7_b {
    // demonstrate scope and functions
    static int aValue = 5;
    public static void main(String[] args) {
        int aValue = 6;
        int bValue = 4;
        bValue = process(bValue);
        System.out.println(bValue);
        System.out.println(aValue);
    }
    private static int process(int aValue) { //AA
        aValue = aValue + 4;
        return aValue;
    }

}
/* output --> 8
              6 */