package co.yedam.person;
/*
 * �̸�, Ű, ������, ������, ����
 */
public class Person {
//	�ʵ� ����
	private String name;
	private int height;
	private int weight;
	private String bloodtype;
	private int age;
	
//	������ ����
	public Person(String name, int height, int weight, String bloodtype, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bloodtype = bloodtype;
		this.age = age;
	}	
//	�޼ҵ� ����
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public String getBloodtype() {
		return this.bloodtype;
	}
	
	public int getAge() {
		return this.age;
	}
	
}


