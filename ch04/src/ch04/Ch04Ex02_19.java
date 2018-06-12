package ch04;

import java.util.Scanner;

public class Ch04Ex02_19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine());
		int rowSum = num*2-1;
		for(int i = 1; i <= rowSum; i++) {
			for(int j = 1; j <= rowSum; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
