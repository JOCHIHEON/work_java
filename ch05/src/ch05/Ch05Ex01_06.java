package ch05;

import java.util.Scanner;

public class Ch05Ex01_06 {
	public static void main(String[] args) {
		
		/*// 1. 10개의 정수 입력
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		// 1-1. 전체 배열을 검사해서 1000 이상의 정수가 발견되면 프로그램 종료
		for(int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			
			if(num >= 1000) {
				// main 메소드를 return 시켜 프로그램 종료
				System.out.println("1000이상의 수를 입력했습니다.");
				return;
			}
		}
		
		// 1-2. 배열의 개수가 10개가 아니면 프로그램 종료
		if (numbers.length != 10) {
			return;
		}
		
		// 2. 가장 작은수 (인트형)스트링, 초기값은 배열의 첫번째 값
		int min = Integer.parseInt(numbers[0]);
		
		// 3. 배열에서 문자열 하나씩 꺼내기
		for (int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			min = min < num  ? min : num;
		}

		System.out.println(min);*/

		int[] numbers = new int[10];
		int min = 0;

		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");

		for (int i = 0; i < inputs.length; i++) {
			numbers[i] = Integer.parseInt(inputs[i]); 
			if(numbers[i] >= 1000) {
				return;
			}
		}
		
		if (inputs.length != 10) {
			return;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			min = numbers[0];
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}

		System.out.println(min);

	}
}
