package ch02;

import java.util.*;

public class Ch02Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-1을 입력해주세요");
		System.out.println("100을 입력해주세요");
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		System.out.printf("%d%n", num1);
		System.out.printf("%d%n", num2);

	}

}
