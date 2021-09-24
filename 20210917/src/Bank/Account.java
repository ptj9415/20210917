package Bank;

public class Account {
	private static String ano;
	private static String owner;
	private static int balance;

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static void showInfo() {
		System.out.println("계좌번호: " + ano + ", 계좌주: " + owner + ", 초기 입금액: " + balance);
	}
}