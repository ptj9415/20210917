package co.yedam.inherit;

/*
 *  People Ŭ�������� ����� �޴� Ŭ����
 *  �ڽ� extends �θ�  ���·� ���
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
//	override: ������
	@Override
	public void showInfo() {
		System.out.println("Name: " + super.getName() + ", Ssn: " + super.getSsn() + ", studentNo: " + this.getStudentNo());
	}
//	Student �� People Class�κ��� ��ӹް�����, ��� Class�� Object��� Class�κ��� ��ӹް�����
//	���� Student �� People �� Object
	@Override
	public String toString() {
		return "�л� [�̸�: " + this.getName() + ", �ֹι�ȣ: " + this.getSsn() + ", �й�: " + this.getStudentNo() + "]";
	}
	
	
	
	
}
