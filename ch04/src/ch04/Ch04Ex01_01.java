package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {
	public static void main(String[] args) {
		/*1.1. 정수를 입력받아 첫 줄에 입력 받은 숫자를 출력하고 둘째 줄에 음수이면 “minus” 라고
		출력하는 프로그램을 작성하시오.*/
		
		// 내 코드
		/*int num;
		Scanner scanner = new Scanner(System.in);
		
		num = scanner.nextInt();
		
		System.out.println(num);
		
		if(num<0) {
			System.out.println("minus");*/
		
		// 1. 정수 입력 받기	
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		// 2. 양수이면 입력받은 숫자만 출력
		if (num > 0) {
			System.out.println(num);
		}
		if (num < 0) {
			System.out.println(num);
			System.out.println("minus");
		}

	}

}
