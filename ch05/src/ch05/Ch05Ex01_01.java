package ch05;

import java.util.Scanner;

public class Ch05Ex01_01 {
	public static void main(String[] args) {
		char[] alpabet = new char[10];
		
		Scanner scanner = new Scanner(System.in);
		
		String[] input = scanner.nextLine().split(" ");
		
		for(int i = 0; i < input.length; i++) {
			alpabet[i] = input[i].charAt(0);
			System.out.print(input[i]);
		}
		
	}
}
