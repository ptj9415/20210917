package co.yedam;

public class ArrayExample {

	public static void main(String[] args) {
		int[] intAry = {1, 2, 3};
		String[] strAry = {"Hello", "World"};
		int num = 10;
		
		Student s1 = new Student();  //  Student라는 데이터에는 name필드, score필드 입력 가능
		s1.name = "홍길동";
		s1.score = 80;
		
		Student s2 = new Student();
		s2.name = "김철수";
		s2.score = 70;
		
		System.out.println("s1학생 이름: " + s1.name);
		System.out.println("s1학생 점수: " + s1.score);
		
		Student s3 = new Student();
		s3.name = "최영희";
		s3.score = 90;
		
		Student[] students = {s1, s2, s3};
		System.out.println("배열의 첫 번째 학생 이름은 " + students[0].name + "이고, " + students[0].score + "점 입니다.");
		System.out.println("배열의 세 번째 학생 이름은 " + students[2].name + "이고, " + students[2].score + "점 입니다.");
		
		s1.name = "박길동";
		s1.score = 30;
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("학생이름: " + students[i].name);
			System.out.println("학생 점수: " + students[i].score);
		}
	
	}
	
}
