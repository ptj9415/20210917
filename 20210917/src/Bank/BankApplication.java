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
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택 >> ");

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
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
		}

//		findAccount(String ano) 메소드는 입금, 출금 시 계좌번호를 찾을 때 사용하는 메소드로 사용
	}

	private static void createAccount() {
		System.out.println("===계좌 생성===");
		String ano = readStr("계좌번호: ");
		String owner = readStr("계좌주: ");
		int balance = readInt("초기입금액: ");
		Account account = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	private static void accountList() {
		System.out.println("===계좌 목록===");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				Account.showInfo();
			}
		}
	}

	private static void deposit() {
		System.out.println("===예금===");
	}

	private static void withdraw() {
		System.out.println("===출금===");
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
				System.out.println("잘못된 값을 입력하였습니다. 다시 입력하세요.");

			}
		}
		return result;
	}
}