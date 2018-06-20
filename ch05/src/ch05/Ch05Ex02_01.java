package ch05;

import java.util.Scanner;

public class Ch05Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] input = scanner.nextLine().split(" ");
		
		char[] result = new char[input.length];
		
		for (int i = 0; i < input.length; i++) {
			String tmp = input[i];
			char tmp2 = tmp.charAt(0);
			result[i] = tmp2;
		}
	}
}
