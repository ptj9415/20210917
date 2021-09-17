package co.yedam.member;

public class Member {
//	user1(아이디), 홍길동(이름), 대구 중구	
	private String id;
	private String name;
	private String address;

	// 생성자:필드에 값을 초기화 하는 용도로 사용
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
		return id; // 반환 필드: 아이디
	}
	
	public String getname() {
		return name; // 반환 필드: 이름
	}
	
	public String getaddress() {
		return address; // 반환 필드: 주소
	}

	// 메소드
	public void showInfo() {
		System.out.println("아이디: " + id + "이름 : " + name + "주소: " + address);
	}

	public void showMemberId() {
		System.out.println("ID: " + id);
	}

	public void showName() {
		System.out.println("이름: " + name);
	}

	public void showAddress() {
		System.out.println("주소: " + address);
	}
}
