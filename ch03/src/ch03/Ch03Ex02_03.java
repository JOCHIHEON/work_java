package ch03;

import java.util.Scanner;

public class Ch03Ex02_03 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력해주세요.");

		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		int finc = ++num1;
		int bdec = num2--;

		System.out.printf("%d %d%n", finc, bdec);
		System.out.printf("%d %d", finc, num2);
	}

}
