package Git1;

public class ConstructorVehicle {
	String Make;
	String Model;
	int Year;

	public ConstructorVehicle(String VehicleMake, String VehicleModel, int VehicleYear) {
		this.Make = VehicleMake;
		this.Model= VehicleModel;
		this.Year = VehicleYear;
	}
	
	public void start() {
		System.out.println("I am Starting");
	}

	public static void main(String[] args) {
		ConstructorVehicle v1 = new ConstructorVehicle("Hyundai", "Elentra", 2019);
		v1.start();

	}

}
