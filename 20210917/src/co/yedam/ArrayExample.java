package co.yedam;

public class ArrayExample {

	public static void main(String[] args) {
		int[] intAry = {1, 2, 3};
		String[] strAry = {"Hello", "World"};
		int num = 10;
		
		Student s1 = new Student();  //  Student��� �����Ϳ��� name�ʵ�, score�ʵ� �Է� ����
		s1.name = "ȫ�浿";
		s1.score = 80;
		
		Student s2 = new Student();
		s2.name = "��ö��";
		s2.score = 70;
		
		System.out.println("s1�л� �̸�: " + s1.name);
		System.out.println("s1�л� ����: " + s1.score);
		
		Student s3 = new Student();
		s3.name = "�ֿ���";
		s3.score = 90;
		
		Student[] students = {s1, s2, s3};
		System.out.println("�迭�� ù ��° �л� �̸��� " + students[0].name + "�̰�, " + students[0].score + "�� �Դϴ�.");
		System.out.println("�迭�� �� ��° �л� �̸��� " + students[2].name + "�̰�, " + students[2].score + "�� �Դϴ�.");
		
		s1.name = "�ڱ浿";
		s1.score = 30;
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("�л��̸�: " + students[i].name);
			System.out.println("�л� ����: " + students[i].score);
		}
	
	}
	
}
