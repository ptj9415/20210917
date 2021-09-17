package co.yedam.lesson;

public class Teacher {
//	필드 부분
	private String name;
	private String major;
	
//	생성자 부분
//	Teacher t1 = new Teacher(); → 공간 만드는걸 인스턴스를 생성한다고 이야기함
	public Teacher(String name, String major) {
		this.name = name;
		this.major = major;
	}
	
//	메소드 부분
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMajor() {
		return this.major;
	}
}
