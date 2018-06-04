package ch03;

import java.util.Scanner;

public class Ch03Ex02_01 {

	public static void main(String[] args) {
		int num1,num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력해주세요.");
		
		// 1. 두 정수를 가로로 입력받기 (배열 필요)
		// 스트링 배열 변수명 = String으로 받아옴   나누는 기준, 공백
		String[] numbers = scanner.nextLine().split(" ");
		
		num1 = Integer.parseInt(numbers[0]);
		num2 = Integer.parseInt(numbers[1]);
		/*
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		*/
		
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		
		System.out.printf("%d / %d = %d...%d", num1, num2, quotient, remainder);
	}

}
