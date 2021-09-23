package co.yedam.member;

import co.yedam.Student;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "parkjiwon", "seoul"); // 생성자 호출
		m1.showInfo();

//		m1.id = "user1";
		m1.setmemberid ("user1");
//		m1.name = "Hong";
		m1.setname("parkjiwon");
//		m1.address = "Daegu";
		m1.setAddress("seoul");
//		System.out.println("아이디: " + m1.id);
		System.out.println("아이디: " + m1.getmemberid());
//		System.out.println("이름: " + m1.name);
		System.out.println("이름: " + m1.getname());
//		System.out.println("주소: " + m1.address);
		System.out.println("주소: " + m1.getaddress());
		
		Member m2 = new Member("user2");
		m2.showInfo();
		
		Member m3 = new Member("user3", "hongkildong", "daegu");
		m3.showInfo();
//		m3.name = "괴물";
		m3.showInfo();
		
		Student s1 = new Student();
		s1.name = "hong";
		s1.score = 90;

		
		
		
		
	}
}
