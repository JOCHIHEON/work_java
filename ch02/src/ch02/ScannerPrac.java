package ch02;

import java.util.Scanner;

public class ScannerPrac {
	public static void main(String[] args) {
		// 1.Scanner를 이용해서 2자리 정수를 입력받으세요.
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("2자리 정수를 하나 입력해주세요.> ");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);	// 입력받은 문자열(String)이 숫자(int)로 바뀜
		
		// int num = scanner.nextInt(); 입력받은 문자열을 정수(int)로 받아 전달
		
		// 2.입력받은 정수를 printf 메소드를 이용하여 10진수, 8진수, 16진수로 출력하세요
		System.out.println("입력내용 : " + input);
		System.out.printf("입력 값 %d을 10진수로 표현하면 %d입니다.%n", num, num);
		System.out.printf("입력 값 %d을 8진수로 표현하면 %o입니다.%n", num ,num);
		System.out.printf("입력 값 %d을 16진수로 표현하면 %#X입니다.%n", num ,num);
	}
}