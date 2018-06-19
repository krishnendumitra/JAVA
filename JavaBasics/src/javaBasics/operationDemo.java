package javaBasics;

public class operationDemo {

	public static void main(String[] args) {
	/*
	 * 
	 * Arithmetic operations
	 * Bitwise
	 * Operational
	 * Logical  
	 *  
	 *  
	 *  
	 *  */
		
		int m=5; int n=2;
		
		int r1= m+n;
		int r2= m/n;
		double r3= m/n;
		double r4= (double)m/n;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		
		int a = 4;
		int b = 4;
		
		b += 3;// b = b +3;
		a += b;// a = a+b;
		System.out.println(a);
		
		int c = n++; //Post increment(First assign and then Increment)
		int p = ++n; //pre increment(First increment and then Assign)
		System.out.println(c);
		System.out.println(p);
		System.out.println(n);
	}

}
