package test01;

 class ClassTest {
	int a; // 멤버변수
	
	ClassTest(){
		System.out.println("ct기본");
//		System.out.println(a); // int형 기본값인 0으로 java가 자동 초기화
	}
	ClassTest(int a){
		System.out.println("ct int생성자");
	}
	ClassTest(String s){
		System.out.println("ct String생성자");
	}
	
	void test() {
		System.out.println("저는 테스트 함수입니다.");
	}
	void test(int a) {
		System.out.println("저는 테스트 int함수입니다.");
	}
	int test(String a) {
		return 0;
	}
	ClassTest test(boolean b) {
		return this;
	}
	String test(double b) {
		return "abc";
	}
	public static void main(String[] args) {
		ClassTest ct = new ClassTest();
		ct.test();
		ct.test(100);
		int a = ct.test("abc");
		String str = ct.test(1.2);
	}
}


