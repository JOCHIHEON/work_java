package ch02;

import java.util.Scanner;
// Scanner를 이용해서 2자리 정수를 입력받으세요.
// 입력받은 정수를 printf 메소드를 이용하여 10진수, 8진수, 16진수로 출력하세요
public class ScannerPrac {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		System.out.print("2자리 정수를 하나 입력해주세요.> ");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용 : " + input);
		System.out.printf("입력 값 %d을 10진수로 표현하면 %d입니다.%n", num, num);
		System.out.printf("입력 값 %d을 8진수로 표현하면 %o입니다.%n", num ,num);
		System.out.printf("입력 값 %d을 16진수로 표현하면 %#X입니다.%n", num ,num);
	}
}