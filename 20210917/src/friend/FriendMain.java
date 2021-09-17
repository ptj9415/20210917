package friend;

/*
 * 친구 목록 관리
 * 1. 이름 2. 연락처 3. 이메일 4. 키 5. 몸무게
 * 친구 등록, 이름으로 친구 조회, 친구 목록, 친구 정보 수정(연락처, 이메일, 키, 몸무게), 친구 삭제, 종료
 */
import java.util.Scanner;

public class FriendMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		Friend[] myFriend = new Friend[50];
		
		while(true) {
			System.out.println("나의 친구 목록 확인 프로그램입니다.\n1. 친구 등록 2. 친구 조회 3. 친구 목록 4. 친구 정보 수정 5. 친구 삭제 5. 종료");
			int menu = readInt("메뉴를 선택하세요.");
			if(menu == 1) {
				System.out.println("친구 등록 메뉴입니다.");
				String name = readStr("친구의 이름을 입력하세요.");
				String phone = readStr("친구의 연락처를 입력하세요.");
				String email = readStr("친구의 이메일을 입력하세요.");
				int height = readInt("친구의 키를 입력하세요.");
				int weight = readInt("친구의 몸무게를 입력하세요.");
				Friend friend = new Friend(name, phone, email, height, weight);
				for(int i = 0; i < myFriend.length; i++) {
					if(myFriend[i] == null) {
						myFriend[i] = friend;
						break;
					}
				}
				System.out.println("저장 완료");
			} else if (menu == 2) {
				System.out.println("친구 조회 메뉴입니다.");
				String search = readStr("조회할 친구 이름을 입력해주세요.");
				for(Friend friend : myFriend) {
					if(friend != null && friend.getName().indexOf(search) != -1)
						friend.showFriend();
				}
			} else if(menu == 3) {
				System.out.println("친구 목록 확인 메뉴입니다.");
				for(Friend friend : myFriend) {
					if(friend!= null)
						friend.showFriend();
						
				}
			} else if(menu == 4) {
				System.out.println("친구 정보 수정 메뉴입니다.");
				String search = readStr("변경할 친구 이름을 입력하세요.");
				String phone = readStr("변경할 전화번호를 입력하세요.");
				String email = readStr("변경할 이메일 주소를 입력하세요.");
				String height = readStr("변경할 키를 입력하세요.");
				String weight = readStr("변경할 몸무게를 입력하세요.");
				
				boolean isExist = false;
				for(int i = 0; i < myFriend.length; i++) {
					if(myFriend[i] != null && myFriend[i].getName().equals(search)) {
						if(!phone.equals("")) {
							myFriend[i].setPhone(phone);
						}
						if(!email.equals("")) {
							myFriend[i].setEmail(email);
						}
						if(!height.equals("")) {
							myFriend[i].setHeight(Integer.parseInt(height));
						}
						if(!weight.equals("")) {
							myFriend[i].setWeight(Integer.parseInt(weight));
						}
						isExist = true;
					}
				}
				if(isExist) {
					System.out.println("정상적으로 수정 완료되었습니다.");
				} else System.out.println("존재하지 않는 친구입니다.");
			} else if ( menu == 5) {
				System.out.println("친구 삭제 메뉴입니다.");
				String search = readStr("삭제할 친구명을 입력하세요.");
				for(int i = 0; i <myFriend.length; i++) {
					if(myFriend[i] != null & myFriend[i].getName().equals(search)) {
						myFriend[i] = null;
					}
				}
				System.out.println("삭제 완료");
			} else if(menu == 9) {
				System.out.println("종료");
				break;
			}
		}
		System.out.println("끝");
	}

	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력하였습니다. 다시 입력하세요.");
			}
		}
		return result;
	}
}
