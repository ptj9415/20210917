package co.yedam.inherit;

public class Example {
	public static void main(String[] args) {
		People p1 = new People("ȫ�浿", "940115-1234567");
		System.out.println("�̸�: " + p1.getName());
		System.out.println("�ֹε�Ϲ�ȣ: " + p1.getSsn());
		p1.showInfo();
		System.out.println(p1.toString());

		Student s1 = new Student("������", "980409-1324356");
		System.out.println("�̸� " + s1.getName());
		System.out.println("�ֹε�Ϲ�ȣ: " + s1.getSsn());
		s1.showInfo();
		System.out.println(s1.toString());
		
		Student s2 = new Student("��ö��", "910211-153821", 110);
		System.out.println("�̸�: " + s2.getName());
		System.out.println("�ֹε�Ϲ�ȣ: " + s2.getSsn());
		System.out.println("�л���ȣ: " + s2.getStudentNo());
		s2.showInfo();
		System.out.println();

		People p2 = new Student("�̱��", "930717-2243241", 130);
//		p1 = new Student("�̱��", "930717-2243241", 130);

//		�θ� Ÿ���� p���� �ڽ� Ÿ���� �����Ҽ�������, �ڽ� Ÿ�Կ����� �θ� Ÿ���� ������ �� ����

//		Student s3 = new People();
//		p2.getStudentNo()

		if (p2 instanceof Student) {
			Student s3 = (Student) p2;
			s3.getStudentNo();
		}
		if (p1 instanceof Student) {
		Student s4 = (Student) p1;
		s4.getStudentNo();
		} else {
			System.out.println("����ȯ �� �� �����ϴ�.");
		}

	}
}
