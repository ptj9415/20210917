package co.yedam.member;

public class Member {
//	user1(���̵�), ȫ�浿(�̸�), �뱸 �߱�	
	private String id;
	private String name;
	private String address;

	// ������:�ʵ忡 ���� �ʱ�ȭ �ϴ� �뵵�� ���
	public Member() {
		id = "user1";
		name = "parkjiwon";
		address = "seoul";
	}

	public Member(String mId) {
		id = mId;
	}

	public Member(String mId, String n, String a) {
		id = mId;
		name = n;
		address = a;
	}
	
	public void setmemberid(String mId) {
		id = mId;
		
	}
	
	public void setname(String n) {
		name = n;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public String getmemberid() {
		return id; // ��ȯ �ʵ�: ���̵�
	}
	
	public String getname() {
		return name; // ��ȯ �ʵ�: �̸�
	}
	
	public String getaddress() {
		return address; // ��ȯ �ʵ�: �ּ�
	}

	// �޼ҵ�
	public void showInfo() {
		System.out.println("���̵�: " + id + "�̸� : " + name + "�ּ�: " + address);
	}

	public void showMemberId() {
		System.out.println("ID: " + id);
	}

	public void showName() {
		System.out.println("�̸�: " + name);
	}

	public void showAddress() {
		System.out.println("�ּ�: " + address);
	}
}
