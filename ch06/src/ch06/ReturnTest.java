package ch06;

public class ReturnTest {
	// return value가 없는 void형이어도  ReferenceParameter를 활용하여 method의 실행 결과를 얻어올수있다.
	// return value가 있는 method를 return value가 없는 method로 바꾸는 방법
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();
		
		int result = r.add(3, 5);
		System.out.println(result);
		
		int[] result2 = {0};
		r.add(3, 5, result2);
		System.out.println(result2[0]);
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}
}
