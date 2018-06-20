
public class check {
	void show(int a){
		if(a<10){
			System.out.println("single digit number");
			}
		if(a>10 && a<100){
			System.out.println("double digit number");
		}
		if(a>100 && a<1000){
			System.out.println("triple digit number");
		}
	}
		public static void main(String[]args){
			check obj= new check();
			obj.show(20);
	}

}
