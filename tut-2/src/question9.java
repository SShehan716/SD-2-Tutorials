public class question9 {
    public static void main(String[] args){
        int i = 1;
        i += ++i + i++ + ++i;
        int j = 1;
        j += ++j + j++ + ++j;
        int k = 1;
        k += k++ + k++ + ++k;
        int m = 1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }

}
