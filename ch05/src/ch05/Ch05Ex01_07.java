package ch05;

import java.util.Scanner;

public class Ch05Ex01_07 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int min = 999;
		int max = 0;
		boolean range = true;
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");

		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(inputs[i]);
		}

		for (int i = 0; i < num.length; i++) {
			if(num[i] < 100) {
				if (num[i] > max) {
					max = num[i];
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			if(num[i] > 100) {
				if (num[i] < min) {
					min = num[i];
				}
			}
		}

		System.out.printf("%d %d", max, min);
	}
}
