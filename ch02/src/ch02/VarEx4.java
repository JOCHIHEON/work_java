
package ch02;

public class VarEx4 {
	public static void main(String[] args) {
		
		// 리터럴의 타입과 접미사
		int octNum = 010;	// 8진수 10, 10진수로 8
		int hexNum = 0x10;	// 16진수 10, 10진수로 16
		int binNum = 0b10;	// 2진수 10, 10진수로 2 (JDK 1.7버전부터 사용가능)
		/* 8진수는 숫자 앞에 0붙임. Octopus
		 * 16진수는 숫자 앞에 0x붙임. 2배
		 * 2진수는 숫자 앞에 0b붙임.
		 */
		
		// 숫자 중간에 _(under bar)는 JDK 1.7버전부터 사용가능
		// long타입은 맨 뒤에 L 붙여야 한다.
		// L 붙이지 않으면 기본형인 int로 인식함.
		long big = 100_000_000_000L;		// long big = 100000000000L; 실무에서는 이렇게 많이 쓰임.
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;	// long hex = 0xFFFFFFFFFFFFFFFFL;
		
		float pi =3.14f;		// 접미사 f 대신 F를 사용해도 된다.
		double rate = 1.618d;	// 접미사 d 대신 D를 사용해도 된다.
		// float pi = 3.14;		// 에러. float타입 변수에 double타입 리터럴 저장불가
		// double rate = 1.618;	// OK. 접미사 d는 생략할 수 있다. 실수형 기본형이 double이기 때문.
		
		// 타입의 불일치 byte(1) short(2) char(2) int(4) long(8)
		//			  float double
		
		int	   i = 'A';		// OK. 문자 'A'의 유니코드인 65가 변수 i에 저장된다, 자동형변환
		long   l = 123;		// OK. int보다 long타입이 더 범위가 넓다.
		double d = 3.14f;	// OK. float보다 double타입이 더 범위가 넓다.
		// int i = 0x123456789;	// 에러. int 타입의 범위를 넘는 값을 저장
								// Duplicate local variable i-변수중복
								// The literal 0x123456789 of type int is out of range 범위 벗어남
		long i1 = 0x123456789L;
		// float f = 3.14			// 에러. float 타입보다 double타입의 범위가 넓다.
		float f = 3.14f;
		byte b = 65;			// OK. byte 타입에 저장 가능한 범위의 int 타입 리터럴
		short s = 0x1234;		// OK. short 타입에 저장 가능한 범위의 int 타입 리터럴
	}
}
