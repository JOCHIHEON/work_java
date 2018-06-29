package ch06;

class Person {
	// 속성(인스턴스 변수)
	// 1. 이름
	String name;
	// 2. 나이
	int age;
	// 3. 주소
	String adress;
	Person (){
	}
	// [2-1] 이름, 나이, 주소 인스턴스 변수를 초기화하는 생성자를 작성하시오.
	Person (String name, int age, String adress){
		this.name = name;	// 생성할 인스턴스 변수
		this.age = age;
		this.adress = adress;
	}
	// [2-3] 이름만 입력받는 생성자를 작성하시오.
	// 단, 나이와 주소값은 각각 기본으로 19, "없음" 값으로 초기화하는 생성자를 작성하시오.
	// (힌트: 2-1에서 작성한 생성자를 이용하여 생성자를 작성하면 됩니다.)
	Person (String name){
		this(name, 19, "없음");	// 첫줄만 this가능
//		this.name = name;
//		this.age = 19;
//		this.adress = "없음";
		
		
	}
	// 행동 (method)
	// 1. 자기소개
	// "저는 [나이]살 [주소]에 사는 [이름]입니다."
	void intro() {
		System.out.println("저는 ["+ age +"]살 [" + adress +"]에 사는 [" + name +"]입니다.");
	}
}
