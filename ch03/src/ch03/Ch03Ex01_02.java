package ch03;

import java.util.Scanner;

public class Ch03Ex01_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 하나 입력해주세요.>");

		String strNum1 = scanner.nextLine();

		int i = Integer.parseInt(strNum1);

		int increase1  = i++;

		System.out.println(increase1);

		int increase2 = ++i;

		System.out.println(increase2);


	}

}
