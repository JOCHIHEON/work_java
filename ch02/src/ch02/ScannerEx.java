package ch02;

import java.util.*;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		// System.in : 표준입력
		// System.out : 표준출력
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);	// 입력받은 문자열을 숫자(int형)로 변환
		/*
		 * print() -> 엔터키x
		 * println() -> 엔터키
		 * printf() -> 형식에 맞게  *f : format
		 */
		System.out.println("입력내용 : " + input);
		System.out.printf("num=%d%n", num);
	}
}
