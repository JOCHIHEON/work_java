package ch05;

import java.util.Scanner;

public class Ch05Ex02_04 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		int tmp = 0;

		for (int i = 0; i < numbers.length; i++) {
			Scanner scanner = new Scanner(System.in);
			numbers[i] = Integer.parseInt(scanner.nextLine());
			if(numbers[i] == -1) {
				tmp = i;
				break;
			}
		}
		if(tmp + 1 > 2) {
			System.out.printf("%d %d %d%n", numbers[tmp-3],numbers[tmp-2], numbers[tmp-1]);
		}
		else {
			System.out.printf("%d %d", numbers[tmp-2],numbers[tmp-1]);
		}
	}
}
