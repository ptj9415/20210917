package co.yedam.inherit;

/*
 *  People 클래스에게 상속을 받는 클래스
 *  자식 extends 부모  형태로 사용
 */
public class Student extends People {
	private int studentNo;

	Student(String name, String ssn) {
		super(name, ssn);

	}

	Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
//	override: 재정의
	@Override
	public void showInfo() {
		System.out.println("Name: " + super.getName() + ", Ssn: " + super.getSsn() + ", studentNo: " + this.getStudentNo());
	}
//	Student → People Class로부터 상속받고있음, 모든 Class는 Object라는 Class로부터 상속받고있음
//	따라서 Student → People → Object
	@Override
	public String toString() {
		return "학생 [이름: " + this.getName() + ", 주민번호: " + this.getSsn() + ", 학번: " + this.getStudentNo() + "]";
	}
	
	
	
	
}
