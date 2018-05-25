package ch02;

import java.util.*;

public class Ch02Ex02_09 {
	public static void main(String[] args) {
		/*두 개의 float형 실수와 한 개의 double형 실수를 입력 받아 소수 3째 자리까지
		출력하는 프로그램을 작성하시오.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("두개의 실수(소숫점 이하7자리)와, 한개의 실수(소숫점 이하15자리)를 입력해주세요.>");
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		float f1 = Float.parseFloat(input1);
		float f2 = Float.parseFloat(input2);
		double dbl = Double.parseDouble(input3);
		
		System.out.printf("%.3f%n", f1);
		System.out.printf("%.3f%n", f2);
		System.out.printf("%.3f%n", dbl);
	}

}
