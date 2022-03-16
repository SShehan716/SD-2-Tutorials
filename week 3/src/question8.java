public class question8 {
    //program 1
    public static void main(String [] args) {
        /*int x= 0;
        int y= 0;
        for (int i = 0; i < 5; i++)
        {
            if (( ++x > 2 ) && (++y > 2))
            {
                x++;
            }
        }
        System.out.println(x + " " + y)*/;

        //Out put - 6 3

    //Program 2
        int x= 0;
        int y= 0;
        for (int i = 0; i < 5; i++)
        {
            if (( ++x > 2 ) || (++y > 2))
            {
                x++;
            }
        }
        System.out.println("x= "+x+" y="+y);

        //output - x= 8 y=2
    }

}
