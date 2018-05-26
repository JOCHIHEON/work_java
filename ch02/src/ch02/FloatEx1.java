package ch02;

public class FloatEx1 {

	public static void main(String[] args) {
		float f = 9.1234567890123456890f;	// 소수점 20자리
		float f2 = 1.234567890123456890f;	// 소수점 19자리
		double d = 9.1234567890123456890d;	// 소수점 20자리
		
		System.out.println("         9.1234567890123456890");
		System.out.printf("f    :   %f%n", f);	//	소수점 이하 6째자리까지 출력.
		System.out.printf("f    : %24.20f%n", f);
		System.out.println("-------------------------------");

		System.out.printf("         12345678901234568901234%n");
		System.out.printf("f2   : %24.20f%n", f2);
		System.out.println("-------------------------------");

		System.out.println("         9.1234567890123456890");
		System.out.printf("d    : %24.20f%n", d);
	}

}