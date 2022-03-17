public class question7_c {
    // demonstrate scope and functions
    static int aValue = 5;
    public static void main(String[] args) {
        double aValue = 6;
        double bValue = 4;
        bValue = process(bValue);
        System.out.println(bValue);
        System.out.println(aValue);
    }
    private static double process(double aValue) { //AA
        aValue = aValue + 4;
        return aValue;
    }

}
/* output --> 8.0
              6.0 */