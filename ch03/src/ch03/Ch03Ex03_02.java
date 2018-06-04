package ch03;

import java.util.Scanner;

public class Ch03Ex03_02 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int quotient;
		double quotient2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 두개를 입력해주세요");
		String[] numbers = scanner.nextLine().split(" ");
		num1 = Integer.parseInt(numbers[0]);
		num2 = Integer.parseInt(numbers[1]);
		
		quotient = num1 / num2;
		
		quotient2 = (double)num1 / num2 ;
		
		System.out.printf("%d %.2f", quotient , quotient2);

			}

}
