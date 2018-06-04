package ch03;

import java.util.Scanner;

public class Ch03Ex01_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 하나 입력해주세요.>");
		
		// 1. 1개의 정수 입력받기
		int num = Integer.parseInt(scanner.nextLine());
		
		// 2. 후치증가 연산자와 전치 연산자를 사용하여 출력
		System.out.println(num++);
		++num;
		System.out.println(num);
		
		/*
		String strNum1 = scanner.nextLine();

		int i = Integer.parseInt(strNum1);
		
		int increase1  = i++;

		System.out.println(increase1);

		int increase2 = ++i;

		System.out.println(increase2);
		*/


	}

}
