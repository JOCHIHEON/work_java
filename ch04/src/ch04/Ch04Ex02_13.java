package ch04;

import java.util.Scanner;

public class Ch04Ex02_13 {
	public static void main(String[] args) {
		int row = 0, column = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		row = Integer.parseInt(scanner.nextLine());
		column = Integer.parseInt(scanner.nextLine());
		
		int i = 1, num = 1;
		while(i <= row) {
			num = i;
			int j = 1;
			while(j <= column) {
				System.out.printf("%d ", num * j);
				j++;
				}
			System.out.println();
			i++;
			}
			
	}

}
