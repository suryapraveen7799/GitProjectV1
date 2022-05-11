package Git1;

public class ConstructorMethod1 {

	//Constructor Method
	public ConstructorMethod1() {
		System.out.println("Thsi is a constructor Method");		
	}

	//Constructor method with parameters
	public ConstructorMethod1(String Param) {
		System.out.println("Constructor method with param" +Param);
	}
	
	// Instance Method
	public void instanceMethod() {
		System.out.println("This is an Instance Method");
	}
	public static void main(String[] args) {
		ConstructorMethod1 C1 = new ConstructorMethod1();
		C1.instanceMethod();
		
		ConstructorMethod1 C2 = new ConstructorMethod1(" Praveen");
		C2.instanceMethod();

	}	

}
