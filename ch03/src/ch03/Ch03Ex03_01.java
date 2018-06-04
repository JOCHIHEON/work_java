package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {

	public static void main(String[] args) {
		double num1, num2;
		int res1,res2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 실수를 입력해주세요.");
		String[] numbers = scanner.nextLine().split(" ");
		num1 = Double.parseDouble(numbers[0]);
		num2 = Double.parseDouble(numbers[0]);
		
		res1 = (int)(num1 * num2);
		
		res2 = (int)(num1) * (int)(num2);
		
		System.out.printf("%d %d", res1, res2);
	}

}
