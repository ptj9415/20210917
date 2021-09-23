package co.yedam.inherit;
/*
 * Bus(자식) >> Vehicle(부모), Taxi(자식) >> Vehicle(부모) 
 */
public class DriveExample {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(t); // Vehicle의 instance이거나 Bus, Taxi의 instance가 올 수 있음
	}
}