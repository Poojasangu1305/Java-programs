package javapractice;
class Emp {
	int sal = 10000000;
}
class eng extends Emp {
	int bn=9999;
}
public class BasicIn {
	public static void main(String[] args) {
		eng E1=new eng() ;
		System.out.println(E1.sal+" "+ E1.bn);
	}
	
}
