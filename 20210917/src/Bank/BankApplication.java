package Bank;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int num = 0;
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1. ���� ���� | 2. ���� ��� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("---------------------------------------------------------");
			System.out.print("���� >> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
			}
		}

//		findAccount(String ano) �޼ҵ�� �Ա�, ��� �� ���¹�ȣ�� ã�� �� ����ϴ� �޼ҵ�� ���
	}

	private static void createAccount() {
		System.out.println("===���� ����===");
		String ano = readStr("���¹�ȣ: ");
		String owner = readStr("������: ");
		int balance = readInt("�ʱ��Աݾ�: ");
		Account account = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
	}

	private static void accountList() {
		System.out.println("===���� ���===");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				Account.showInfo();
			}
		}
	}

	private static void deposit() {
		System.out.println("===����===");
	}

	private static void withdraw() {
		System.out.println("===���===");
	}

	public static String readStr(String msg) {
		System.out.print(msg);
		return scn.nextLine();
	}

	public static int readInt(String msg) {
		System.out.print(msg);
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