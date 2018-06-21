package ch05;

import java.util.Scanner;

public class Ch05Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] inputs = scanner.nextLine().split(" ");
		int[] num = new int[5];
		for (int i = 0; i < inputs.length; i++) {
			num[i] = Integer.parseInt(inputs[i]);
		}
		
		int sum = num[0] + num[2] + num[4];
		System.out.print(sum);
	}
}
