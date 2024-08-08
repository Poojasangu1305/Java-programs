package program;
class person {
	int age=19;
	String name="pp";
	float id;
	void details() {
		System.out.println("age"+":"+age);
		System.out.println("name"+":"+name);
	}
}
public class Obj_cls {

	public static void main(String[] args) {
		person mmm = new person();
		mmm.details();
		
	}

}
