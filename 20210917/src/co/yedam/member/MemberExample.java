package co.yedam.member;

import co.yedam.Student;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "parkjiwon", "seoul"); // ������ ȣ��
		m1.showInfo();

//		m1.id = "user1";
		m1.setmemberid ("user1");
//		m1.name = "Hong";
		m1.setname("parkjiwon");
//		m1.address = "Daegu";
		m1.setAddress("seoul");
//		System.out.println("���̵�: " + m1.id);
		System.out.println("���̵�: " + m1.getmemberid());
//		System.out.println("�̸�: " + m1.name);
		System.out.println("�̸�: " + m1.getname());
//		System.out.println("�ּ�: " + m1.address);
		System.out.println("�ּ�: " + m1.getaddress());
		
		Member m2 = new Member("user2");
		m2.showInfo();
		
		Member m3 = new Member("user3", "hongkildong", "daegu");
		m3.showInfo();
//		m3.name = "����";
		m3.showInfo();
		
		Student s1 = new Student();
		s1.name = "hong";
		s1.score = 90;

		
		
		
		
	}
}
