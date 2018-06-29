package ch06;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		/*Tv[] tvArr = new Tv[3];

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;	// tvArr[i]의 channel에 i + 10을 저장
		}

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();	// tvArr[i]의 메서드를 호출 채널이 1증가
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}*/
		
		
		// 1. 사람 3명(객체 3개) 만들기
		Person[] perArr = new Person[3];
		for (int i = 0; i < perArr.length; i++) {
			perArr[i] = new Person();
		}
		// 2. 각 사람(객체)마다 이름, 나이, 주소 설정.
		// (자기 자신 포함해서 옆 사람 정보 작성하기)
		
		// [2-2] 아래 방법은 instance 생성 후  instance 변수에 접근하여 
		// 값을 초기화 한 부분이다.
		// 아래 부분을 2-1에서 작성한 생성자를 이용하여 변경하시오.
		perArr[0].name = "조치헌";
		perArr[1].name = "이우도";
		perArr[2].name = "최명권";
		
		perArr[0].age = 23;
		perArr[1].age = 26;
		perArr[2].age = 25;
		
		perArr[0].adress = "인천";
		perArr[1].adress = "부천";
		perArr[2].adress = "광명";
		
//		// 기본생성자를 이용하여 instance를 생성한경우
//		Car c1 = new Car();
//		c1.color	= "white";
//		c1.gearType = "auto";
//		c1.door = 4;
//
//		// 파라메터 3개인 생성자를 이용하여 객체를 생성한 경우
//		Car c2 = new Car("white", "auto", 4);
	
		Person[] perArr2 = new Person[3];
		
		perArr2[0] = new Person("조치헌", 23, "인천");
		perArr2[1] = new Person("이우도", 26, "부천");
		perArr2[2] = new Person("최명권", 25, "광명");
		

		// 3. Person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요.
		// for문사용
		for (int i = 0; i < perArr.length; i++) {
			perArr[i].intro();
		}
		
		// [2-4] 2-3에서 생성한 생성자를 이용하여 "흥민"이라는 이름으로 사람 객체 하나를 생성하세요.
		Person hm = new Person("흥민"); 
		 
		
		// [2-5] 2-4 객체를 이용하여 introduce() 메서드를 호출하세요.
		hm.intro();
	}
}
