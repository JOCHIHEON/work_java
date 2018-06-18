package ch05;

import java.util.Scanner;

public class Ch05Ex01_03 {
	public static void main(String[] args) {
		
		
		char[] chArr = new char[10];
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			chArr[i] = input[i].charAt(0);
		}
		System.out.printf("%c %c %c",chArr[0], chArr[3], chArr[6]);
	}
}
