package co.yedam.lesson;

/*
 * 학생 이름, 연락처, 주소
 */
public class Student {
//	필드 부분
	private String studentName;
	private String phone;
	private String address;
	
//	생성자 부분
	public Student(String name, String phone, String address) {
		this.studentName = name;
		this.phone = phone;
		this.address = address;
	}
	
//	메소드 부분
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getAddress() {
		return this.address;		
	}
	
}
