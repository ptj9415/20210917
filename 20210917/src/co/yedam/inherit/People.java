package co.yedam.inherit;

/*
 *   상속: 부모가 가진 재산을 자식이 물려받는것 (부모 클래스가 갖고있는 필드, 생성자, 메소드 등을 자식 클래스에서 사용가능)
 */

public class People extends Object{
	private String name;
	private String ssn;
	
	public People() {
		
	}
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void showInfo() {
		System.out.println("이름은 " + name + ", 주민등록번호: " + ssn);
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", ssn=" + ssn + "]";
	}

	
}

	

