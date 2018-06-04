package ch03;

import java.util.Scanner;

public class Ch03Ex01_07 {

	public static void main(String[] args) {
		int num1,num2,num3;
		boolean isNum1Big,areEqualAll;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 3개를 입력해주세요.");
		
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		// 첫번째 수가 가장크면 true, 아니면 false
		isNum1Big = (num1>num2) && (num1>num3);
		// 세 수가 모두 같으면 true, 아니면 false
		areEqualAll = (num1==num2) && (num2==num3);
		System.out.printf("%b %b", isNum1Big, areEqualAll);
	}

}
