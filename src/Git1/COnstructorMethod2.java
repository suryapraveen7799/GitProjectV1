package Git1;

public class COnstructorMethod2 {

	public COnstructorMethod2() {
	System.out.println("Welcome to Walmart");}
	
	public void getname(String Param) {
		System.out.println("Customer Name is " + Param);
	}

	public static void main(String[] args) {
		COnstructorMethod2 C3 = new COnstructorMethod2();
		C3.getname("Riddhi");
	}

}
