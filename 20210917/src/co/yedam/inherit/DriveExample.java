package co.yedam.inherit;
/*
 * Bus(�ڽ�) >> Vehicle(�θ�), Taxi(�ڽ�) >> Vehicle(�θ�) 
 */
public class DriveExample {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(t); // Vehicle�� instance�̰ų� Bus, Taxi�� instance�� �� �� ����
	}
}