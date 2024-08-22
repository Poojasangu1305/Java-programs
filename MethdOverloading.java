package javapractice;
class Loading {
	public void std(int rollnum) {
		System.out.println(rollnum);
	}
	public void std(int id,int phn) {
		System.out.println(id+" "+phn);
	}
	public void std(int marks,String name,float idd) {
		System.out.println(marks+" "+name+" "+idd);
	}
	
}
public class MethdOverloading {
	public static void main (String[] args) {
		Loading s1=new Loading();
		s1.std(8);
		s1.std(23,45);
		s1.std(23,"pp",22.4);
		
	}

}
