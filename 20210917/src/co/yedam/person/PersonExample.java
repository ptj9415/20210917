package co.yedam.person;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("������", 168, 59, "A", 26);
		Person p2 = new Person("ȫ�浿", 174, 83, "AB", 28);
		Person p3 = new Person("�迵��", 159, 43, "O", 31);
		
//		family >> ��������(�̸�, ������, ����) ����ϱ�
//		�̸�: getName , ������: getBloodtype, ����: getAge
		Person[] family = {p1, p2, p3};
		for (int i = 0; i < family.length; i++) {
			System.out.println("�̸��� " + family[i].getName() + "�̰�, �������� " + family[i].getBloodtype() + "�̸�, ���̴� " + family[i].getAge() + " �Դϴ�.");
		}
//		System.out.println("�� �̸��� " + family[0].getName() + "�̰�, �������� " + family[0].getBloodtype() + "�̸�, ���̴� " + family[0].getAge() + "�Դϴ�.");
//		System.out.println("�� ���� �̸��� " + family[1].getName() + "�̰�, �������� " + family[1].getBloodtype() + "�̸�, ���̴� " + family[1].getAge() + "�Դϴ�.");
//		System.out.println("�� ������ �̸��� " + family[2].getName() + "�̰�, �������� " + family[2].getBloodtype() + "�̸�, ���̴� " + family[2].getAge() + "�Դϴ�.");

//		Ű�� 165 �̻��� ������ ���
		for (int i = 0; i < family.length; i++) {
			if(family[i].getHeight() > 165) {
				System.out.println("Ű 165�� �Ѵ� ������ " + family[i].getName() + " �Դϴ�.");
			}
			
		}
		
//		p3�� �������� AB�� �����ϰ�, �������� AB���� ������ ���
		p3.setBloodtype(null);
		p3.setBloodtype ("AB");
		for(int i = 0; i < family.length; i++) {
			if(family[i].getBloodtype() == "AB") {
				System.out.println("�������� AB���� ������ " + family[i].getName() + " �Դϴ�.");
			}
		}

//		Car c1 = new Car();
//		c1.carmodel = "Sonata";
//		c1.carname = "Sonata_Hybrid";
//		c1.maxspeed = -200;
	}
}
