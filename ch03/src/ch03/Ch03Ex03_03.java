package ch03;

import java.util.Scanner;

public class Ch03Ex03_03 {

	public static void main(String[] args) {
		int num1, num2, num3;
		double avg;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수로 된 3과목 점수를 입력");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		
		// 평균구하기
		avg = (num1+num2+num3)/3.0;
		
		// 소수 첫재짜리까지 출력
		System.out.printf("%.1f",avg);
				
	}

}
