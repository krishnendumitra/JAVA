public class swap {
	void show(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("first number is num1: "+a);
		System.out.println("second number is num2: "+b);
	}

	public static void main(String[] args) {
		swap obj = new swap();
		obj.show(4, 2);

	}
}
