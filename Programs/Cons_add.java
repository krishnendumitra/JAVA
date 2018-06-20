import java.util.Scanner;
public class Cons_add {
	public Cons_add(){
		int a,b,c;
		System.out.println("enter the values of a & b: ");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=a+b;
		System.out.println("the sum of a and b is: "+c);
	}

	public static void main(String[] args) {
		Cons_add obj=new Cons_add();

	}

}
