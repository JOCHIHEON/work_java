package ch03;

import java.util.Scanner;

public class Ch03Ex01_03 {
	public static void main(String[] args) {
		/*
		 * 두 개의 정수를 입력받아 각각 후치 증가 연산자와 
		 * 전치 감소 연산자를 사용하여 두 수의 곱을 구한 후 
		 * 각각의 값을 출력하는 프로그램을 작성하시오.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력해주세요 >");
	
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		int i1 = Integer.parseInt(strNum1);
		int i2 = Integer.parseInt(strNum2);
		
		int bpls = i1++;
		int fmin = --i2;
		
		int result = bpls * fmin;
		
		System.out.printf("%d %d %d", i1, fmin, result);
	}

}
