package ifElseSwitchCase;

public class IfElseDemo2 {

	public static void main(String[] args) {
		
		int num1 = 25;
		int num2 = 78;
		int num3 = 87;
		int num4 = 97;
		
		if(num1>num2 &num1>num3& num1>num4)
		{
			System.out.println("First number is the greatest " +num1);
		}
		else if(num2>num3& num2>num4&num2>num1)
		{
			System.out.println("Second number is the greatest " +num2);
		}
		else if(num3>num4&num3>num4&num3>num1)
		{
			System.out.println("Third number is the greatest " +num3);
		}
		else
			System.out.println("Last number is the greatest " +num4);
	}

}
