package ch03;

import java.util.Scanner;

public class Ch03Ex01_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 2개를 입력해주세요.");
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		
		System.out.printf("%d > %d --- %b%n", num1, num2, num1 > num2);
		System.out.printf("%d < %d --- %b%n", num1, num2, num1 < num2);
		System.out.printf("%d >= %d --- %b%n", num1, num2, num1 >= num2);
		System.out.printf("%d <= %d --- %b%n", num1, num2, num1 <= num2);
		

		/*
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();

		int i1 = Integer.parseInt(strNum1);
		int i2 = Integer.parseInt(strNum2);
		
		boolean result = i1>i2;
		System.out.printf("%d > %d --- %b%n", i1, i2, result);

		boolean result1 = i1<i2;
		System.out.printf("%d < %d --- %b%n", i1, i2, result1);

		boolean result2 = i1>=i2;
		System.out.printf("%d >= %d --- %b%n", i1, i2, result2);

		boolean result3 = i1<=i2;
		System.out.printf("%d <= %d --- %b%n", i1, i2, result3);
		*/

	}

}
