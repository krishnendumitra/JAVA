public class armstrong {
	void arm(int n)
	{
		int n1= n;
		int n2= 0;
		int d;
		while(n>0)
		{
			d= n%10;
			n2= n2+d*d*d;
			n= n/10;
		}
		if(n2==n1)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not armstrong number");
		}
		}
		public static void main(String[] ags) {
			armstrong obj= new armstrong ();
			obj.arm(153);
	}

}


