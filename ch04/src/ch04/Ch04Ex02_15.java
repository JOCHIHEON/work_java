package ch04;

import java.util.Scanner;

public class Ch04Ex02_15 {
	public static void main(String[] args) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		num = Integer.parseInt(scanner.nextLine());
		
		for(int i = 1; i <= num; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();		
		}
		
		for(int i = 1; i <= num; i++) {
			for(int j = num-1; i <= j; j--) {
				System.out.print("*");
			}
			System.out.println();	
		}
		

	}

}
