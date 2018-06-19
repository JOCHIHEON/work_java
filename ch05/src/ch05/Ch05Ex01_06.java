package ch05;

import java.util.Scanner;

public class Ch05Ex01_06 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		int min = 0;
		
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		
		for (int i = 0; i < inputs.length; i++) {
			numbers[i] = Integer.parseInt(inputs[i]); 
			if(numbers[i] >= 1000) {
				break;
			}
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
