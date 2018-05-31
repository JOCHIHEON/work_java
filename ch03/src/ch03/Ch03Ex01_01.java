package ch03;

import java.util.Scanner;

public class Ch03Ex01_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력해주세요.");
		
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		int i1 = Integer.parseInt(strNum1);
		int i2 = Integer.parseInt(strNum2);
		
		i1 += 100;
		i2 %= 10;
		
		System.out.printf("%d",i1);
		System.out.printf("%d%n",i2);

	}

}
