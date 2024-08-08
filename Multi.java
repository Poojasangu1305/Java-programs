package program;
class Opp {
	int x1;
	int y1;
	void adddd () {
		int aa = x1+y1;
		int subb=x1-y1;
		int mul=x1*y1;
		System.out.println(aa);
		System.out.println(subb);
		System.out.println(mul);
	}
}
public class Multi {

	public static void main(String[] args) {
		Opp var1=new Opp();
		Opp var2=new Opp();
		var1.x1=2;
		var1.y1=10;
		
		var2.x1=55;
		var2.y1=121;
		
		var1.adddd();
		var2.adddd();

	}
}

