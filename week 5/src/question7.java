public class question7 {
 // demonstrate scope and functions
        static int aValue = 5;
        public static void main(String[] args) {
            int aValue = 6;
            int bValue = 4;
            process(bValue);
            System.out.println(aValue);
        }
        private static void process(int aValue) { //AA
            aValue = aValue + 4;
            System.out.println(aValue);
        }

}
/* output --> 8
              6 */