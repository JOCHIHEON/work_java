package ch05;

import java.util.Scanner;

public class Ch05Ex02_08 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(input[i]);
		}
	}
}
