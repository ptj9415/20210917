package co.yedam.lesson;

/*
 * �л� �̸�, ����ó, �ּ�
 */
public class Student {
//	�ʵ� �κ�
	private String studentName;
	private String phone;
	private String address;
	
//	������ �κ�
	public Student(String name, String phone, String address) {
		this.studentName = name;
		this.phone = phone;
		this.address = address;
	}
	
//	�޼ҵ� �κ�
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
