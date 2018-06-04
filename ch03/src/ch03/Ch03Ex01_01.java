package ch03;

import java.util.Scanner;

public class Ch03Ex01_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력해주세요.");
		
		// 1. 정수 2개 입력받기
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		int i1 = Integer.parseInt(strNum1);
		int i2 = Integer.parseInt(strNum2);
		
		// int num1 = Integer.parseInt(scanner.nextLine());
		
		// 2. 첫번째 수에는 100을 증가, 두 번째 수는 10으로 나눈 나머지 저장
		i1 += 100;
		i2 %= 10;
		
		System.out.printf("%d",i1);
		System.out.printf("%d%n",i2);

	}

}
