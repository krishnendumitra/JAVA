package javaBasics;

public class MethodOverloading {
	void add(int a, int b) {
		int sum = a + b;
		System.out.println("Addition is:" + sum);
	}

	void add(float a, float b, float c) {
		float sum = a + b + c;
		System.out.println("Addition is:" + sum);
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(10, 20);
		obj.add(30.57f, 40.64f,8.45f);
	}
}
