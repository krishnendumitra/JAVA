import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		int calc;
		float a,b,c;
		System.out.println("Enter the value of a & b: ");
		Scanner in= new Scanner(System.in);
		a=in.nextFloat();
		b=in.nextFloat();
		System.out.println("Enter the case no.: ");
		calc=in.nextInt();
		switch (calc)
		{
		case 1:
			c=a+b;
			System.out.println("the sum is : "+c);
			break;
			
		case 2:
			c=a-b;
			System.out.println("The differnce is: "+c);
			break;
			
		case 3:
			c=a*b;
			System.out.println("the result is: "+c);
			break;
			
		case 4:
			c=a/b;
			System.out.println("the quotient is: "+c);
			break;
			
		case 5:
			c=a%b;
			System.out.println("the remainder is: "+c);
			break;
			
			default:
				System.out.println("invalid choice...enter a choice between 1 to 5.");
		
			
		}

	}

}
