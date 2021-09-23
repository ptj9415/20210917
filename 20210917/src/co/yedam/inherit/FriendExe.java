package co.yedam.inherit;

import co.yedam.ScanUtil;

public class FriendExe {
//	친구, 학교친구, 회사친구를 배열에 저장
//	CompFriend >> Friend, UnivFriend >> Friend
	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;
	// univ, comp

	private FriendExe() {
		friends = new Friend[100];
		friends[0] = new Friend("홍길동", "010-1234-5678");
		friends[1] = new Friend("김길동", "010-1234-9393");
		friends[2] = new Friend("김철수", "010-5151-5678");
		friends[3] = new UnivFriend("박수진", "010-1532-2943", "수학과");
		friends[4] = new CompFriend("최영호", "010-9382-1183", "영업부");
		friends[5] = new Friend("홍길동", "010-0872-0091");
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1. 친구 추가\t 2. 친구 조회\t 3. 친구 수정\t 4. 친구 삭제\t 5. 종료");
			System.out.println("-----------------------------------------------------------------------");
//		ScanUtil su = new ScanUtil(); // instance 메모리 할당
//		su.readInt(null);
			int menu = ScanUtil.readInt("메뉴를 선택하세요.");
			if (menu == 1) {
				System.out.println("추가");
				addFriend();
			} else if (menu == 2) {
				System.out.println("조회");
				showList();
			} else if (menu == 3) {
				System.out.println("수정");
				modify();
			} else if (menu == 4) {
				System.out.println("삭제");
				delete();
			} else if (menu == 5) {
				System.out.println("종료");
				break;
			}
		}
		System.out.println("=== 프로그램 끝 ===");
	}

	private void addFriend() {
//		친구, 학교친구, 회사친구
		System.out.println("1. 친구\t 2. 학교 친구\t 3. 회사 친구");
		int choice = ScanUtil.readInt("메뉴를 선택하세요.");
		String name = ScanUtil.readStr("이름을 입력하세요.");
		String phone = ScanUtil.readStr("연락처를 입력하세요.");
		Friend friend = null;
		if (choice == 1) {
			friend = new Friend(name, phone);
		} else if (choice == 2) {
			String major = ScanUtil.readStr("전공을 입력하세요.");
			friend = new UnivFriend(name, phone, major);

		} else if (choice == 3) {
			String depart = ScanUtil.readStr("부서를 입력하세요.");
			friend = new CompFriend(name, phone, depart);
		}
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("등록 성공");
	}

	private void showList() {
//		이름, 연락처 입력 >> 홍길동, 김길동 >> 길동이라는 이름 넣으면 둘다 
//		연락처도 1111-1211, 2222-1211 >> 1211 조회하면 둘다 나오도록
//		길동, 1211 >> 이름 & 연락처

		System.out.println("친구 조회 메뉴입니다.");
//		String search = ScanUtil.readStr("조회할 친구의 이름, 연락처를 입력해주세요.");
		// 이름만 입력을 받았는지, 연락처만 받았는지, 둘다 받았는지
		String name;
		String phone;
		while (true) {
			name = ScanUtil.readStr("이름을 입력하세요.");
			phone = ScanUtil.readStr("연락처를 입력하세요.");
			boolean isExist = false;
			boolean nameflag = true;
			boolean phoneflag = true;
			if (name.equals(""))
				nameflag = false;
			if (phone.equals(""))
				phoneflag = false;
			if ((nameflag || phoneflag) == true)
				break;
		}
		/*
		 * 1. 이름 / 연락처 중에 뭐가 공백이냐 아니냐 2. 뭐 하나라도 공백이 아니라면 조건에 맞는 친구를 찾아야되요. A.indexOf(B)
		 * = 문자열 A에서 문자열 B가 시작하는 인덱스 번호를 RETURN
		 */
		for (Friend friend : friends) {
			if (friend == null)
				continue;
			if (name.equals("") == false && phone.equals("") == false) {
				if (friend.getName().indexOf(name) != -1 && friend.getPhone().indexOf(phone) != -1)
					System.out.println(friend.toString());
			} else if (name.equals("") == false && phone.equals("") == true) {
				if (friend.getName().indexOf(name) != -1)
					System.out.println(friend.toString());
			} else if (name.equals("") == true && phone.equals("") == false) {
				if (friend.getPhone().indexOf(phone) != -1)
					System.out.println(friend.toString());
			}
		}
	}

	private void modify() {
		System.out.println("[친구 목록]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("친구 번호를 선택하세요.");
		String phone = ScanUtil.readStr("바꿀 전화번호를 입력하세요.");
		if (phone.equals(""))
			System.out.println("전화번호를 바꾸지 않습니다.");
		else
			friends[num].setPhone(phone);
		if (friends[num] instanceof UnivFriend) {
			String major = ScanUtil.readStr("바꿀 전공을 입력하세요.");
			if (major.equals(""))
				System.out.println("전공을 바꾸지 않습니다.");
			else
				((UnivFriend) friends[num]).setMajor(major);
		} else if (friends[num] instanceof CompFriend) {
			String depart = ScanUtil.readStr("바꿀 부서를 입력하세요.");
			if (depart.equals(""))
				System.out.println("부서를 바꾸지 않습니다.");
			else
				((CompFriend) friends[num]).setDepart(depart);
		}
		System.out.println("수정 완료");
	}

	private void delete() {
		System.out.println("[친구 목록]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("삭제할 친구의 번호를 선택하세요.");
		if (friends[num] == null)
			System.out.println("삭제할 친구의 정보가 없습니다.");
		else {
			friends[num] = null;
			System.out.println("삭제 완료");
		}
	}
}
