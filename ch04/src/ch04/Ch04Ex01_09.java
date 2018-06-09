package ch04;

import java.util.Scanner;

public class Ch04Ex01_09 {
	public static void main(String[] args) {
		/*1.9. 3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는
		프로그램을 작성하시오.*/
		int num1, num2, num3;
		int minNum = 0;
		Scanner scanner = new Scanner(System.in);

		String[] numbers = scanner.nextLine().split(" ");

		num1 = Integer.parseInt(numbers[0]);
		num2 = Integer.parseInt(numbers[1]);
		num3 = Integer.parseInt(numbers[2]);

		/*if (num1 < num2) {
			if(num1 < num3) {
				minNum = num1;
			} else {
				minNum = num3;
			}
		} else if(num2<num3) {
			minNum = num2;
		} else {
			minNum = num3;
		}*/
		
		if(num1< num2 && num1 <num3) {
			minNum = num1;
		} else if (num2 < num3) {
			minNum = num2;
		} else {
			minNum = num3;
		}
		System.out.println(minNum);
	}

}
