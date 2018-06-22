package ch05;

import java.util.Scanner;

public class Ch05Ex02_08 {
	public static void main(String[] args) {
		int[] numbers = new int[1];
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		int multiplesOfFive = 0;
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if(Integer.parseInt(input) == 0) {
				break;
			}
			for (int i = 0; i < numbers.length; i++) {
				if (i == numbers.length) {	// Ch05Ex01_12
					int[] tmp = new int[numbers.length * 3];
					System.arraycopy(numbers, 0, tmp, 0, numbers.length);
					numbers = tmp;
				}
				numbers[i] = Integer.parseInt(input);
				if(numbers[i] % 5 == 0) {
					sum += numbers[i];
					multiplesOfFive++;
				}
			}
		}
		avg = sum / (double)multiplesOfFive;
		
		System.out.printf("Multiples of 5 : %d%n", multiplesOfFive);
		System.out.printf("sum : %d%n", sum);
		System.out.printf("avg : %.1f%n", avg);

	}
}
