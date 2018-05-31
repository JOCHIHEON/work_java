package ch03;

import java.util.Scanner;

public class Ch03Ex01_07 {

	public static void main(String[] args) {
		int num1,num2,num3;
		boolean result1,result2;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 3개를 입력해주세요.");

		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
	
		result1 = (num1>num2) && (num1>num3);
		result2 = (num1==num2) && (num2==num3);
		System.out.printf("%b %b", result1, result2);
	}

}
