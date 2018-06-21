package ch05;

import java.util.Scanner;

public class Ch05Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[10];
		int oddSum = 0;
		int evenSum = 0;
		String[] inputs = scanner.nextLine().split(" ");
		
		for (int i = 0; i < inputs.length; i++) {
			num[i] = Integer.parseInt(inputs[i]);
			if (i % 2 == 0) {
				oddSum += num[i];
			}
			else {
				evenSum += num[i];
			}
		}
		
		System.out.println("odd : " + oddSum);
		System.out.println("even : " + evenSum);
	}
}
