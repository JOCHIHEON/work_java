package ch05;

import java.util.Scanner;

public class Ch05Ex01_15 {
	public static void main(String[] args) {
		
		int[][] score = new int[5][5];
		// each
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < 5; i++) {
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");
			
			for (int j = 0; j < numbers.length; j++) {
				score[i][j] = Integer.parseInt(numbers[j]);
				sum += score[i][j];
			}
			
			score[i][4] = sum / 4;
			sum = 0;	
		}
		
		int count = 0;
		
		for (int i = 0; i < 5; i++) {
			if (score[i][4] >= 80) {
				System.out.println("pass");
				count++;
			}
			else {
				System.out.println("fail");
			}
		}
		System.out.println("Successful : " + count);
		
	}
}
