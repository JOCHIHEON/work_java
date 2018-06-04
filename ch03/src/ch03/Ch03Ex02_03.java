package ch03;

import java.util.Scanner;

public class Ch03Ex02_03 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력해주세요.");
		String[] numbers = scanner.nextLine().split(" ");
		num1 = Integer.parseInt(numbers[0]);
		num2 = Integer.parseInt(numbers[1]);
		
		/*
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		*/
		
		/*
		 * 두 정수를 입력받아 첫 번째 수는 전치증가연산자를 사용하고
		 *  두 번째 수는 후치감소연산자를 사용하여 출력하고 바뀐 값을 
		 *  다시 출력하는 프로그램을 작성하시오.
		 */
		System.out.printf("%d %d%n", ++num1, num2--);
		System.out.printf("%d %d", num1, num2);
	}

}
