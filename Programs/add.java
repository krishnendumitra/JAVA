public class add {
	void show(int a, int b) {
		int sum = a + b;
		System.out.println("Addition is:" + sum);
	}

	public static void main(String[] args) {
		add obj = new add();
		obj.show(10, 20);
	}
}
