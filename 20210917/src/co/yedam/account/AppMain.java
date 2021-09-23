package co.yedam.account;
import java.util.Scanner;

public class AppMain {
	
//	�̱��� : new ������ >> ���ο� instance �������
	private static AppMain singleton = new AppMain();
//	������ private�� �����Ͽ� �ܺο��� ���� ���ϵ��� ����
	private AppMain() {
		
	}
	
//	method getInstacne()
	public static AppMain getInstance() {
		return singleton;
	}
	
	Account[] accountArray = new Account[100];
	Scanner scanner = new Scanner(System.in);
	
	
	public void createAccount() {
		System.out.println("���� ����");
	}

	public void accountList() {
		System.out.println("���� ���");
	}

	public void deposit() {
		System.out.println("�Ա�");
	}

	public void withdraw() {
		System.out.println("���");
	}

	public Account findAccount(String ano) {
		return null;
	}

	public void execute() {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		while (run) {
		System.out.println("- - - - - - -");
		System.out.println("1. ���»���   2. ���¸��   3. ����   4. ���   5. ����");
		System.out.println("- - - - - - -");
		System.out.println("����>>");
		int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
	}
}
