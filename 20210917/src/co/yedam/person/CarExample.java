package co.yedam.person;

public class CarExample {
	public static void main(String[] args) {
		
		Car sonata = new Car("Sonata", "Sonata_Hybrid", 2000, 200, new Tire());
		sonata.getCarname();
		sonata.getCarmodel();
		sonata.getPrice();
		sonata.getMaxspeed();
		sonata.getTire();

	}

}
