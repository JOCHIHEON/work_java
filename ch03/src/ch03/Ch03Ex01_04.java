package ch03;

import java.util.Scanner;

public class Ch03Ex01_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력해주세요.");
		// 1. 정수 2개 입력받기
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		
		// 2. 첫번째 줄은 두 값이 같으면 true, 아니면 false
		System.out.println(num1 == num2);
		
		// 3. 두번째 줄은 두  값이 다르면 true, 아니면 false
		System.out.println(num1 != num2);

		
		/*
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		int i1 = Integer.parseInt(strNum1);
		int i2 = Integer.parseInt(strNum2);
		
		boolean result1 = i1 == i2;
		boolean result2 = i1 != i2;
		
		System.out.printf("%b%n%b", result1, result2);
		// (num1 == num2 ? true : flase);
		*/
	}

}
