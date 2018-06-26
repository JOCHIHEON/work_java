package ch06;

/*class Card {
	String kind;				// 카드 무늬 - 인스턴스 변수
	int number;					// 카드 숫자 - 인스턴스 변수
	static int width = 100;		// 카드의 폭 - 클래스 변수
	static int height = 250;	// 카드의 높이 - 클래스 변수
}*/
class Person {
	// 속성(인스턴스 변수)
	// 1. 이름
	String name;
	// 2. 나이
	int age;
	// 3. 주소
	String adress;
	
	// 행동 (method)
	// 1. 자기소개
	// "저는 [나이]살 [주소]에 사는 [이름]입니다."
	void intro() {
		System.out.println("저는 ["+ age +"]살 [" + adress +"]에 사는 [" + name +"]입니다.");
	}
}
