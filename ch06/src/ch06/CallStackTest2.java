package ch06;

public class CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[] args) method가 시작되었음.");
		firstMethod();	// static method는 객체 생성없이 호출가능하다.
		System.out.println("main(String[] args) method가 끝났음.");
	}

	static void firstMethod() {
		System.out.println("firstMethod() method가 시작되었음.");
		secondMethod();
		System.out.println("firstMethod() method가 끝났음.");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod() method가 시작되었음.");
		System.out.println("secondMethod() method가 끝났음.");
	}
}
