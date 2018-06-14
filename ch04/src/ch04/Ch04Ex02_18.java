package ch04;

import java.util.Scanner;

public class Ch04Ex02_18 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		int allLow = num*2-1;
		int midLow = allLow/2+1;
		for(int i = 1; i <= allLow; i++) {
			if(i <= midLow) {
				for(int j = 1; j <= i; j++) {
					System.out.print("#");
				}
				System.out.println();
			} else {
				for(int j = midLow; j <= allLow; j++) {
					if(j-i>=0) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
				
			}
		}
	}
}

