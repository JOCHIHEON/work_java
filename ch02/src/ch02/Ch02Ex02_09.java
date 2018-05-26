package ch02;

import java.util.*;

public class Ch02Ex02_09 {
	public static void main(String[] args) {
		/*두 개의 float형 실수와 한 개의 double형 실수를 입력 받아 소수 3째 자리까지
		출력하는 프로그램을 작성하시오.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("두개의 실수(소숫점 이하7자리)와, 한개의 실수(소숫점 이하15자리)를 입력해주세요.>");
		
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		String strNum3 = scanner.nextLine();
		
		float num1 = Float.parseFloat(strNum1);
		float num2 = Float.parseFloat(strNum2);
		double num3 = Double.parseDouble(strNum3);
		
		System.out.printf("%.3f%n", num1);
		System.out.printf("%.3f%n", num2);
		System.out.printf("%.3f%n", num3);
	}

}
