package co.yedam.inherit;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run(); // protected type
		vehicle.stop(); // default type
	}
}
