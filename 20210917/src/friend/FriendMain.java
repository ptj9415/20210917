package friend;

/*
 * ģ�� ��� ����
 * 1. �̸� 2. ����ó 3. �̸��� 4. Ű 5. ������
 * ģ�� ���, �̸����� ģ�� ��ȸ, ģ�� ���, ģ�� ���� ����(����ó, �̸���, Ű, ������), ģ�� ����, ����
 */
import java.util.Scanner;

public class FriendMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		Friend[] myFriend = new Friend[50];
		
		while(true) {
			System.out.println("���� ģ�� ��� Ȯ�� ���α׷��Դϴ�.\n1. ģ�� ��� 2. ģ�� ��ȸ 3. ģ�� ��� 4. ģ�� ���� ���� 5. ģ�� ���� 5. ����");
			int menu = readInt("�޴��� �����ϼ���.");
			if(menu == 1) {
				System.out.println("ģ�� ��� �޴��Դϴ�.");
				String name = readStr("ģ���� �̸��� �Է��ϼ���.");
				String phone = readStr("ģ���� ����ó�� �Է��ϼ���.");
				String email = readStr("ģ���� �̸����� �Է��ϼ���.");
				int height = readInt("ģ���� Ű�� �Է��ϼ���.");
				int weight = readInt("ģ���� �����Ը� �Է��ϼ���.");
				Friend friend = new Friend(name, phone, email, height, weight);
				for(int i = 0; i < myFriend.length; i++) {
					if(myFriend[i] == null) {
						myFriend[i] = friend;
						break;
					}
				}
				System.out.println("���� �Ϸ�");
			} else if (menu == 2) {
				System.out.println("ģ�� ��ȸ �޴��Դϴ�.");
				String search = readStr("��ȸ�� ģ�� �̸��� �Է����ּ���.");
				for(Friend friend : myFriend) {
					if(friend != null && friend.getName().indexOf(search) != -1)
						friend.showFriend();
				}
			} else if(menu == 3) {
				System.out.println("ģ�� ��� Ȯ�� �޴��Դϴ�.");
				for(Friend friend : myFriend) {
					if(friend!= null)
						friend.showFriend();
						
				}
			} else if(menu == 4) {
				System.out.println("ģ�� ���� ���� �޴��Դϴ�.");
				String search = readStr("������ ģ�� �̸��� �Է��ϼ���.");
				String phone = readStr("������ ��ȭ��ȣ�� �Է��ϼ���.");
				String email = readStr("������ �̸��� �ּҸ� �Է��ϼ���.");
				String height = readStr("������ Ű�� �Է��ϼ���.");
				String weight = readStr("������ �����Ը� �Է��ϼ���.");
				
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
					System.out.println("���������� ���� �Ϸ�Ǿ����ϴ�.");
				} else System.out.println("�������� �ʴ� ģ���Դϴ�.");
			} else if ( menu == 5) {
				System.out.println("ģ�� ���� �޴��Դϴ�.");
				String search = readStr("������ ģ������ �Է��ϼ���.");
				for(int i = 0; i <myFriend.length; i++) {
					if(myFriend[i] != null & myFriend[i].getName().equals(search)) {
						myFriend[i] = null;
					}
				}
				System.out.println("���� �Ϸ�");
			} else if(menu == 9) {
				System.out.println("����");
				break;
			}
		}
		System.out.println("��");
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
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		return result;
	}
}
