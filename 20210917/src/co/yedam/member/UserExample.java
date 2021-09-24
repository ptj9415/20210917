package co.yedam.member;

public class UserExample {
	public static void main(String[] args) {
		User user1 = null;
		user1 = new User("user1", "1234");
		user1.setUserName("고길동");
		user1.setUserGrade(Grade.Super);
		user1.setUserAge(20);

		User user2 = new User("user2", "5555", "사용자2", Grade.Guest, 25);
		String name = user2.getUserName();
		int age = user2.getUserAge();
		Grade grade = user2.getUserGrade();
		
		if(name.equals("고길동")) {
			user1.setUserGrade(Grade.Special);
		}
		if(age >= 25 ) {
			user1.setUserGrade(Grade.Mid);
		}
		if(grade == Grade.Guest) {
			user1.setUserGrade(grade);
		}
		
		System.out.println(user2.toString());
		user1.showInfo();
		
		User user3 = new SpceialUser("user2", "5555", "박태준", Grade.Special, 29, 1000);
		user3.showInfo();
	}
}
