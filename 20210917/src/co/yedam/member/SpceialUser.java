package co.yedam.member;

public class SpceialUser extends User {
	private int point;

	public SpceialUser(String userId, String userPw, String userName, Grade userGrade, int userAge) {
		super(userId, userPw, userName, userGrade, userAge);
	}

	public SpceialUser(String userId, String userPw, String userName, Grade userGrade, int userAge, int point) {
		super(userId, userPw, userName, userGrade, userAge);
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public void showInfo() {
		System.out.println("이름은 " + userName + ", 나이는 " + userAge + ", ID는 " + userId + ", 비밀번호는 " + userPw + ", 등급은 "
				+ userGrade + ", 포인트는 " + point + " 입니다.");
		super.getUserId();
		super.getUserAge();
		super.getUserId();
		super.getUserPw();
		super.getUserGrade();
		this.getPoint();

	}

}
