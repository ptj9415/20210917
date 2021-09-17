package co.yedam.person;

public class Car {

//	필드
	private String carname;
	private String carmodel;
	private int price;
	private int maxspeed;
	private Tire tire;
	
//	생성자
	public Car(String carname, String carmodel, int price, int maxspeed, Tire tire) {
		this.carname = carname;
		this.carmodel = carmodel;
		this.price = price;
		this.maxspeed = maxspeed;
		this.tire = tire;
	}
	
//	메소드
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
}