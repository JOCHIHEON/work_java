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
		perArr[0].name = "조치헌";
		perArr[1].name = "이우도";
		perArr[2].name = "최명권";
		
		perArr[0].age = 23;
		perArr[1].age = 26;
		perArr[2].age = 25;
		
		perArr[0].adress = "인천";
		perArr[1].adress = "부천";
		perArr[2].adress = "광명";
	
		

		// 3. Person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요.
		// for문사용
		for (int i = 0; i < perArr.length; i++) {
			perArr[i].intro();
		}
	}
}
