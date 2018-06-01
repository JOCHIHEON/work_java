package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {

	public static void main(String[] args) {
		double num1, num2, num3;
		int sum;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("실수로 된 3과목의 점수 입력");
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		num3 = scanner.nextDouble();
		
		sum = (int)num1 + (int)num2 + (int)num3;
		avg = (num1 + num2 + num3)/3;
		System.out.printf("sum %d%navg %d", sum, (int)avg);

	}

}
