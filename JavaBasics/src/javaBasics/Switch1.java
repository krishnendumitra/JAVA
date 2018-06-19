package javaBasics;
import java.util.Scanner;

class Season {

	void check(int month) {
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("autumn");

			break;
		default:
			System.out.println("invalid month");
			break;
		}
	}

}

public class Switch1 {

	public static void main(String args[]) {

		System.out.println("Enter the month number: ");
		Scanner in = new Scanner(System.in);
		int EnteredNumber = in.nextInt();
		Season obj = new Season();
		obj.check(EnteredNumber);

	}

}
