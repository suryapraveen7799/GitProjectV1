package Git1;

public class Dog {

	public static void main(String[] args) {
		nod("Zypsy");
		bark();
		sleep();
		eat();
		
		//Dog 2
		nod("Rocky");
		bark();
		sleep();
		eat();
		
	}
    public static void nod(String name) {
	System.out.println(String.format("Name is : %s ", name));
}
    public static void bark() {
    	System.out.println("I am barking");
    }
    public static void sleep() {
    	System.out.println("I am Sleeping");
    }
    public static void eat() {
    	System.out.println("I am eating");
    }


}
