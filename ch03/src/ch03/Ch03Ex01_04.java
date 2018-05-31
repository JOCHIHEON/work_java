package ch03;

import java.util.Scanner;

public class Ch03Ex01_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력해주세요.");
		
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		int i1 = Integer.parseInt(strNum1);
		int i2 = Integer.parseInt(strNum2);
		
		boolean result1 = i1 == i2;
		boolean result2 = i1 != i2;
		
		System.out.printf("%b%n%b", result1, result2);
	}

}
