package co.yedam.lesson;

public class Teacher {
//	�ʵ� �κ�
	private String name;
	private String major;
	
//	������ �κ�
//	Teacher t1 = new Teacher(); �� ���� ����°� �ν��Ͻ��� �����Ѵٰ� �̾߱���
	public Teacher(String name, String major) {
		this.name = name;
		this.major = major;
	}
	
//	�޼ҵ� �κ�
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
