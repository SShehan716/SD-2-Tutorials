public class IntegerMaxMin {
    public static void main(String[] args){
        int min = -2147483647 , max = 2147483647;
        // we can't do this because int value range is -2147483647 to 2147483647.
        System.out.println(max+1);
        System.out.println(min-1);
    }
}
