package co.yedam.member;

enum Grade {
	Special, Super, Mid, Guest
}

public class User {
//	사용자 ID, PW, 이름, 등급, 나이 필드
	String userId;
	String userPw;
	String userName;
	Grade userGrade;
	int userAge;

//	생성자
	public User() {
	}

	public User(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;

	}

	public User(String userId, String userPw, String userName, Grade userGrade, int userAge) {
		this(userId, userPw);
		this.userName = userName;
		this.userGrade = userGrade;
		this.userAge = userAge;
	}

//	메소드 생성
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Grade getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(Grade userGrade) {
		this.userGrade = userGrade;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userGrade=" + userGrade
				+ ", userAge=" + userAge + "]";
	}
	
	public void showInfo() {
		System.out.println("이름은 " + userName + ", 나이는 " + userAge + ", ID는 " + userId + ", 비밀번호는 " + userPw + ", 등급은 " + userGrade + "입니다.");
	}

}
