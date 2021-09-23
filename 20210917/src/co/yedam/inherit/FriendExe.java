package co.yedam.inherit;

import co.yedam.ScanUtil;

public class FriendExe {
//	ģ��, �б�ģ��, ȸ��ģ���� �迭�� ����
//	CompFriend >> Friend, UnivFriend >> Friend
	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;
	// univ, comp

	private FriendExe() {
		friends = new Friend[100];
		friends[0] = new Friend("ȫ�浿", "010-1234-5678");
		friends[1] = new Friend("��浿", "010-1234-9393");
		friends[2] = new Friend("��ö��", "010-5151-5678");
		friends[3] = new UnivFriend("�ڼ���", "010-1532-2943", "���а�");
		friends[4] = new CompFriend("�ֿ�ȣ", "010-9382-1183", "������");
		friends[5] = new Friend("ȫ�浿", "010-0872-0091");
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1. ģ�� �߰�\t 2. ģ�� ��ȸ\t 3. ģ�� ����\t 4. ģ�� ����\t 5. ����");
			System.out.println("-----------------------------------------------------------------------");
//		ScanUtil su = new ScanUtil(); // instance �޸� �Ҵ�
//		su.readInt(null);
			int menu = ScanUtil.readInt("�޴��� �����ϼ���.");
			if (menu == 1) {
				System.out.println("�߰�");
				addFriend();
			} else if (menu == 2) {
				System.out.println("��ȸ");
				showList();
			} else if (menu == 3) {
				System.out.println("����");
				modify();
			} else if (menu == 4) {
				System.out.println("����");
				delete();
			} else if (menu == 5) {
				System.out.println("����");
				break;
			}
		}
		System.out.println("=== ���α׷� �� ===");
	}

	private void addFriend() {
//		ģ��, �б�ģ��, ȸ��ģ��
		System.out.println("1. ģ��\t 2. �б� ģ��\t 3. ȸ�� ģ��");
		int choice = ScanUtil.readInt("�޴��� �����ϼ���.");
		String name = ScanUtil.readStr("�̸��� �Է��ϼ���.");
		String phone = ScanUtil.readStr("����ó�� �Է��ϼ���.");
		Friend friend = null;
		if (choice == 1) {
			friend = new Friend(name, phone);
		} else if (choice == 2) {
			String major = ScanUtil.readStr("������ �Է��ϼ���.");
			friend = new UnivFriend(name, phone, major);

		} else if (choice == 3) {
			String depart = ScanUtil.readStr("�μ��� �Է��ϼ���.");
			friend = new CompFriend(name, phone, depart);
		}
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("��� ����");
	}

	private void showList() {
//		�̸�, ����ó �Է� >> ȫ�浿, ��浿 >> �浿�̶�� �̸� ������ �Ѵ� 
//		����ó�� 1111-1211, 2222-1211 >> 1211 ��ȸ�ϸ� �Ѵ� ��������
//		�浿, 1211 >> �̸� & ����ó

		System.out.println("ģ�� ��ȸ �޴��Դϴ�.");
//		String search = ScanUtil.readStr("��ȸ�� ģ���� �̸�, ����ó�� �Է����ּ���.");
		// �̸��� �Է��� �޾Ҵ���, ����ó�� �޾Ҵ���, �Ѵ� �޾Ҵ���
		String name;
		String phone;
		while (true) {
			name = ScanUtil.readStr("�̸��� �Է��ϼ���.");
			phone = ScanUtil.readStr("����ó�� �Է��ϼ���.");
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
		 * 1. �̸� / ����ó �߿� ���� �����̳� �ƴϳ� 2. �� �ϳ��� ������ �ƴ϶�� ���ǿ� �´� ģ���� ã�ƾߵǿ�. A.indexOf(B)
		 * = ���ڿ� A���� ���ڿ� B�� �����ϴ� �ε��� ��ȣ�� RETURN
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
		System.out.println("[ģ�� ���]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("ģ�� ��ȣ�� �����ϼ���.");
		String phone = ScanUtil.readStr("�ٲ� ��ȭ��ȣ�� �Է��ϼ���.");
		if (phone.equals(""))
			System.out.println("��ȭ��ȣ�� �ٲ��� �ʽ��ϴ�.");
		else
			friends[num].setPhone(phone);
		if (friends[num] instanceof UnivFriend) {
			String major = ScanUtil.readStr("�ٲ� ������ �Է��ϼ���.");
			if (major.equals(""))
				System.out.println("������ �ٲ��� �ʽ��ϴ�.");
			else
				((UnivFriend) friends[num]).setMajor(major);
		} else if (friends[num] instanceof CompFriend) {
			String depart = ScanUtil.readStr("�ٲ� �μ��� �Է��ϼ���.");
			if (depart.equals(""))
				System.out.println("�μ��� �ٲ��� �ʽ��ϴ�.");
			else
				((CompFriend) friends[num]).setDepart(depart);
		}
		System.out.println("���� �Ϸ�");
	}

	private void delete() {
		System.out.println("[ģ�� ���]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("������ ģ���� ��ȣ�� �����ϼ���.");
		if (friends[num] == null)
			System.out.println("������ ģ���� ������ �����ϴ�.");
		else {
			friends[num] = null;
			System.out.println("���� �Ϸ�");
		}
	}
}
