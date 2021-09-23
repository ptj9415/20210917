package co.yedam.inherit;

public class Example {
	public static void main(String[] args) {
		People p1 = new People("홍길동", "940115-1234567");
		System.out.println("이름: " + p1.getName());
		System.out.println("주민등록번호: " + p1.getSsn());
		p1.showInfo();
		System.out.println(p1.toString());

		Student s1 = new Student("박태준", "980409-1324356");
		System.out.println("이름 " + s1.getName());
		System.out.println("주민등록번호: " + s1.getSsn());
		s1.showInfo();
		System.out.println(s1.toString());
		
		Student s2 = new Student("김철수", "910211-153821", 110);
		System.out.println("이름: " + s2.getName());
		System.out.println("주민등록번호: " + s2.getSsn());
		System.out.println("학생번호: " + s2.getStudentNo());
		s2.showInfo();
		System.out.println();

		People p2 = new Student("이기쁨", "930717-2243241", 130);
//		p1 = new Student("이기쁨", "930717-2243241", 130);

//		부모 타입인 p에는 자식 타입을 지정할수있지만, 자식 타입에서는 부모 타입을 지정할 수 없음

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
			System.out.println("형변환 할 수 없습니다.");
		}

	}
}
