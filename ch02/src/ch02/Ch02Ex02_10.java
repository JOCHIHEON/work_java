package ch02;

import java.util.*;

public class Ch02Ex02_10 {
	public static void main(String[] args) {
		/*두 개의 정수형 변수를 선언하고 각 변수를 키보드로 입력받아 그 변수를
		이용하여 출력 예와 같이 출력하는 프로그램을 작성하시오.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("두개의 정수를 입력해주세요.>");
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int d1 = Integer.parseInt(input1);
		int d2 = Integer.parseInt(input2);
		
		System.out.printf("%d + %d = %d%n", d1,d2,d1+d2);
		
		
	}
}
