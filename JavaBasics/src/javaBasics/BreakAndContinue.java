package javaBasics;

public class BreakAndContinue {

	public static void main(String[] args) {

		int i;
		
//		for (i = 1; i <= 10; i++) {
//
//			if (i == 6 || i == 7) {
//				continue;
//			}
//			System.out.println("the number is " + i);
//		}
//
//	}
//
//}

		for (i = 9; i >= 1; i--) {

			if (i == 6 || i == 2)
			{
				break;
			}
			System.out.println("the number is " + i);
		}
	}
}