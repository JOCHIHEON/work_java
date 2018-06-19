package ch05;

import java.util.Scanner;

public class Ch05Ex01_09 {
	public static void main(String[] args) {
		// ArrayEx10 참고
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[10];
		String[] inputs = scanner.nextLine().split(" ");
		for (int i = 0; i < inputs.length; i++) {
			num[i] = Integer.parseInt(inputs[i]);
		}
	}
}
