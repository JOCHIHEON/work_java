package ch04;

import java.util.Scanner;

public class Ch04Ex02_07 {
	public static void main(String[] args) {
		// 2.7. 정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오.
		
		int num = 1, input;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		while(num <= input) {		
		System.out.printf(num + " ");
		num++;
		}
		

	}

}
