package ch04;

import java.util.Scanner;

public class Ch04Ex02_17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		int s = 1;

		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(j-i>=0) {
					if(s >= 10) {
						s = 0;
					}
					System.out.print(s + " ");
					s++;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
