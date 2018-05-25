package ch02;

import java.util.Scanner;

public class Ch02Ex02_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("네개의 정수를 입력해주세요");
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		String input4 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);
		int num4 = Integer.parseInt(input4);
		
		System.out.printf("%d - %d = %d%n", num1,num2, num1-num2);
		System.out.printf("%d - %d = %d%n", num3,num4, num3-num4);


	}

}
