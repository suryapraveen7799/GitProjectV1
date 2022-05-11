package Git1;

public class DoubleMethod {

	public static void main(String[] args) {
     System.out.println(add(12,13));
     System.out.println(add(03,10));
     System.out.println(add(12,10));
     System.out.println(add(22,28));
     System.out.println(add(12.3,26.2));
	}
	public static double add(double num1, double num2) {
		double add = num1 + num2;
		return add;
	}
	

}
