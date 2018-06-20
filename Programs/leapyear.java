
public class leapyear {
	void check(int a) {
		if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))) {
			System.out.println("leap year");
		} else {
			System.out.println("not leap year");
		}
	}

	public static void main(String[] args) {
		leapyear obj = new leapyear();
		obj.check(2000);
	}

}
