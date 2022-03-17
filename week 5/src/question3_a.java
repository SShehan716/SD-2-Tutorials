public class question3_a {

    private static int multiply(int sum1, int sum2){
        sum1=sum1*sum2;
        return sum1;
    }

    public static void main(String[] args) {
        int aValue = 3;
        int bValue = 2;
        int multiplied_value  = multiply(aValue, bValue);
        System.out.println(bValue+" "+multiplied_value);
    }

}

// Output --> 2 6