package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {
	public static void main(String[] args) {
		// 1.10. 두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
		int num1,num2;
		int result = 0; 
		
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		num1 = Integer.parseInt(numbers[0]);
		num2 = Integer.parseInt(numbers[1]);
		
		if (num1<num2) {
			result = num2 - num1;
		}else {
			result = num1 -num2;
		}
		System.out.println(result);
	}

}
