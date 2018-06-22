package ch05;

import java.util.Scanner;

public class Ch05Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		
		char[] result = new char[input.length];
		
		for (int i = 0; i < input.length; i++) {
			result[i] = input[i].charAt(0); // char = string(0)
		}
		
		for (int i = input.length-1; i >= 0; i--) {
			System.out.print(result[i] + " ");
		}
	}
}