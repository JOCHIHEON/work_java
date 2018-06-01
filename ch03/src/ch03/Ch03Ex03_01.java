package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {

	public static void main(String[] args) {
		double num1, num2;
		int result,result2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 실수를 입력해주세요.");
		
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		
		result = (int)(num1 * num2);
		
		result2 = (int)(num1) * (int)(num2);
		
		System.out.printf("%d %d", result, result2);
				
		
		
	}

}
