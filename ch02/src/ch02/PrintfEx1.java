package ch02;

public class PrintfEx1 {
	
	public static void main (String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;	// long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010;	// 8진수 10, 10 진수로는 8
		int hexNum = 0x10;	// 16진수 10, 10 진수로는 16
		int binNum = 0b10;	// 2진수 10, 10진수로는 2
		
		/*
		 * %b : boolean 형식출력
		 * %d : 10진수
		 * %o : 8진수
		 * %x, %X : 16진수
		 * %f : float
		 * %e, %E : 지수
		 * %c : 문자
		 * %s : 문자열
		 */
		System.out.printf("b=%d%n", b);		 // Argument(Parameter) : 인자
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int) c);	// (자료형)변수명, 명시적 형변환
		System.out.printf("finger=[%5d]%n", finger);	// 5칸할당, 오른쪽정렬
		System.out.printf("finger=[%-5d]%n", finger);	// 5칸할당, 왼쪽정렬
		System.out.printf("finger=[%05d]%n", finger);	// 5칸할당,빈칸 0으로 채움
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); 
		// Integer.toBinaryString() 2진수로 표현
	}
}
