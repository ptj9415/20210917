package co.yedam.person;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("박태준", 168, 59, "A", 26);
		Person p2 = new Person("홍길동", 174, 83, "AB", 28);
		Person p3 = new Person("김영희", 159, 43, "O", 31);
		
//		family >> 가족정보(이름, 혈액형, 나이) 출력하기
//		이름: getName , 혈액형: getBloodtype, 나이: getAge
		Person[] family = {p1, p2, p3};
		for (int i = 0; i < family.length; i++) {
			System.out.println("이름은 " + family[i].getName() + "이고, 혈액형은 " + family[i].getBloodtype() + "이며, 나이는 " + family[i].getAge() + " 입니다.");
		}
//		System.out.println("제 이름은 " + family[0].getName() + "이고, 혈액형은 " + family[0].getBloodtype() + "이며, 나이는 " + family[0].getAge() + "입니다.");
//		System.out.println("제 형의 이름은 " + family[1].getName() + "이고, 혈액형은 " + family[1].getBloodtype() + "이며, 나이는 " + family[1].getAge() + "입니다.");
//		System.out.println("제 동생의 이름은 " + family[2].getName() + "이고, 혈액형은 " + family[2].getBloodtype() + "이며, 나이는 " + family[2].getAge() + "입니다.");

//		키가 165 이상인 가족만 출력
		for (int i = 0; i < family.length; i++) {
			if(family[i].getHeight() > 165) {
				System.out.println("키 165가 넘는 가족은 " + family[i].getName() + " 입니다.");
			}
			
		}
		
//		p3의 혈액형을 AB로 변경하고, 혈액형이 AB형인 가족만 출력
		p3.setBloodtype(null);
		p3.setBloodtype ("AB");
		for(int i = 0; i < family.length; i++) {
			if(family[i].getBloodtype() == "AB") {
				System.out.println("혈액형이 AB형인 가족은 " + family[i].getName() + " 입니다.");
			}
		}

//		Car c1 = new Car();
//		c1.carmodel = "Sonata";
//		c1.carname = "Sonata_Hybrid";
//		c1.maxspeed = -200;
	}
}
