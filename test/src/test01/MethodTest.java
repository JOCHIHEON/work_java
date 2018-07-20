package test01;

public class MethodTest {
	String str = "abc";

	// 데이터 타입은 String
	// 함수명은 test()
	// 3개의 동일한 함수명으로 선언과
	// 호출
	String test() {
		return str;
	}
	String test(int a) {
		return a+"";
	}
	String test(double a) {
		return a+"";
	}
	public static void main(String[] args) {
		MethodTest mt1 = new MethodTest();
		MethodTest mt2 = new MethodTest();
		System.out.println(mt1.str == mt2.str);
		System.out.println(mt1.test());
		System.out.println(mt1.test(1));
		System.out.println(mt1.test(1.1));
	}
	
}
