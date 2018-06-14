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
		// 2. 조건연산자(삼항연산자)를 이용하여 첫번째와 두번째 수 비교
		int min01 = num1 < num2 ? num1 : num2;

		// 3. 조건연산자(삼항연산자)를 이용하여 2번에서 작은수와 세번째 수 비교
		int min02 = min01 < num3 ? min01 : num3;

		// 4. 최종적으로 젤 작은 숫자는 min02 변수에 저장된다.
		// min02 변수를 출력한다.
		System.out.println(min02);

		/*if(num1< num2 && num1 <num3) {
			minNum = num1;
		} else if (num2 < num3) {
			minNum = num2;
		} else {
			minNum = num3;
		}
		System.out.println(minNum);*/
	}

}
