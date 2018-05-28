package ch03;

public class OperatorEx05 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b); // 정수 나누기 정수는 정수
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); // 정수 나누기 실수는 실수
	}

}
