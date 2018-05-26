package ch02;

import java.util.Scanner;

public class Ch02Ex02_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("네개의 정수를 입력해주세요");
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		String strNum3 = scanner.nextLine();
		String strNum4 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int num3 = Integer.parseInt(strNum3);
		int num4 = Integer.parseInt(strNum4);
		int result = num1 - num2;
		int result2 = num3 - num4;
		
		System.out.printf("%d - %d = %d%n", num1,num2, result);
		System.out.printf("%d - %d = %d%n", num3,num4, result2);


	}

}
