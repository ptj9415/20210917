package co.yedam;

public class MemberExample {

	public static void main(String[] args) {

		Member m1 = new Member();
		m1.memberId = 10;
		m1.memberName = "È«±æµ¿";
		m1.phone = "010-1234-5678";

		Member m2 = new Member();
		m2.memberId = 20;
		m2.memberName = "±èÃ¶¼ö";
		m2.phone = "010-8765-4312";

		Member[] members = { m1, m2 };
		for (Member member : members) {
			member.showInfo();
			
//			m1 ¡æ members[0]
			m1.memberName = "±è¹Ì¸²";
			members[0].phone = "010-1231-2342";
			for( Member member1 : members) {
				System.out.println("¾ÆÀÌµð; " + member1.memberId);
			}
		}
	}

}
