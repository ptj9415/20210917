package co.yedam.enumerate;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "ȫ�浿";
		p1.gender = Gender.MAN;
		p1.address = "�뱸";
		
		Person p2 = new Person();
		p2.name = "�迵��";
		p2.gender = Gender.WOMAN;
		p2.address = "����";

		Person[] persons = { p1, p2 };
		for (Person person : persons) {
			if (person.gender == Gender.WOMAN) {
				System.out.println("�̸�: " + person.name + " " + Gender.WOMAN + "\n");
			}
		}

		Week today = Week.FRI;
		Week[] weeks = Week.values();
		for (Week week : weeks) {
			System.out.println(week.name());
		}
	}
}
