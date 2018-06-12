package ch04;

import java.util.Scanner;

public class Ch04Ex02_17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int num = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (n+1)-i; k++) {
				System.out.printf("%1d",num);
				num++;
			}
			System.out.println();
		}

	}

}
