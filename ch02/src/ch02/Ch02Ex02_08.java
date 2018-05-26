package ch02;

import java.util.*;
public class Ch02Ex02_08 {
	public static void main(String[] arg) {
		/*실수 2개와 한 개의 문자를 입력 받아 출력하되 실수는 반올림하여 소수
		둘째자리까지 출력하는 프로그램을 작성하시오.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("실수 2개와 한 개의 문자를 입력해주세요.");
		
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		String strChar = scanner.nextLine();
		
		// 입력받은 실수 2개를 실수(double)형으로 변경
		// 단, 문자는 굳이 문자로 변경할 필요가 없다.
		
		float f1 = Float.parseFloat(strNum1);
		float f2 = Float.parseFloat(strNum2);
		
		System.out.printf("%.2f%n", f1);
		System.out.printf("%.2f%n", f2);
		System.out.printf("%s%n", strChar);


	}
}
