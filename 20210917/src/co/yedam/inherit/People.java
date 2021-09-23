package co.yedam.inherit;

/*
 *   ���: �θ� ���� ����� �ڽ��� �����޴°� (�θ� Ŭ������ �����ִ� �ʵ�, ������, �޼ҵ� ���� �ڽ� Ŭ�������� ��밡��)
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
		System.out.println("�̸��� " + name + ", �ֹε�Ϲ�ȣ: " + ssn);
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", ssn=" + ssn + "]";
	}

	
}

	

