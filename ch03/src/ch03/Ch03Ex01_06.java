package ch03;

import java.util.Scanner;

public class Ch03Ex01_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 2개를 입력해주세요.");
		
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		
		// 0이 아니면 참, 0이면 거짓
		
		boolean res1 = num1 != 0;
		boolean res2 = num2 != 0;
		
		// 결과 출력하기
		
		System.out.printf("%b %b%n", res1 && res2, res1 || res2);
		
		/*
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();

		int i1 = Integer.parseInt(strNum1);
		int i2 = Integer.parseInt(strNum2);
		
		boolean b1 = i1 != 0;
		boolean b2 = i2 != 0;
		
		boolean result1 = b1 && b2;
		boolean result2 = b1 || b2;
		
		System.out.printf("%b %b", result1, result2);
		*/
	}

}
