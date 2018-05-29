package ch03;

public class OperatorEx09 {
	public static void main(String []args) {
		long a = 1000000 * 1000000;		// int * int = int
		long b = 1000000 * 1000000L;	// int * long = long
		
		System.out.println("a=" + a);	// 비정상 출력
		System.out.println("b=" + b);	// 정상 출력
	}
}
