package ch02;

import java.util.*;
public class Ch02Ex02_08 {
	public static void main(String[] arg) {
		/*실수 2개와 한 개의 문자를 입력 받아 출력하되 실수는 반올림하여 소수
		둘째자리까지 출력하는 프로그램을 작성하시오.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("실수 2개와 한 개의 문자를 입력해주세요.");
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		float f1 = Float.parseFloat(input1);
		float f2 = Float.parseFloat(input2);
		String ch = input3;
				
		System.out.printf("%.2f%n", f1);
		System.out.printf("%.2f%n", f2);
		System.out.printf("%s%n", input3);


	}
}
