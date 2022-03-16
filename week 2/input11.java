import java.util.*;

public class input11
{
	public static void main(String[]args)
	{
		String numToRead;
		System.out.println("enter Number");
		Scanner inputNum = new Scanner(System.in);
		numToRead = inputNum.nextLine();
		System.out.println("This is the number you entered ->" + numToRead);
		System.out.println("This is the power of the number you entered ->" + numToRead);
	}
}