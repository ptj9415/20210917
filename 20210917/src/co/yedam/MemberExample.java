package co.yedam;

public class MemberExample {

	public static void main(String[] args) {

		Member m1 = new Member();
		m1.memberId = 10;
		m1.memberName = "ȫ�浿";
		m1.phone = "010-1234-5678";

		Member m2 = new Member();
		m2.memberId = 20;
		m2.memberName = "��ö��";
		m2.phone = "010-8765-4312";

		Member[] members = { m1, m2 };
		for (Member member : members) {
			member.showInfo();
			
//			m1 �� members[0]
			m1.memberName = "��̸�";
			members[0].phone = "010-1231-2342";
			for( Member member1 : members) {
				System.out.println("���̵�; " + member1.memberId);
			}
		}
	}

}
