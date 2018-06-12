package ch04;

import java.util.Scanner;

public class Ch04Ex02_18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
				
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		for(int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = n; k > i; k--) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
