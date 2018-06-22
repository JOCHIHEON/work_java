package ch05;

import java.util.Scanner;

public class Ch05Ex02_12 {
	public static void main(String[] args) {
		int[] score = new int[1];

		while(true) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if(Integer.parseInt(input) == 0) {
				break;
			}
			int num = Integer.parseInt(input);
			for (int i = 0; i < score.length; i++) {
				if (i == score.length) {	// Ch05Ex01_12
					int[] tmp = new int[score.length * 2];
					System.arraycopy(score, 0, tmp, 0, score.length);
					score = tmp;
				}
				score[i] = Integer.parseInt(input);
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		
		
		
		
		
		/*for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if(score[i] % 10 == 1) {
					result[j]++;
				}
				else if (score[i] / 10 == 9){
					result[j]++;
				}
				else if (score[i] / 10 == 8){
					result[j]++;
				}
				else if (score[i] / 10 == 6){
					result[j]++;
				}
				else if (score[i] / 10 == 4){
					result[j]++;
				}
			}
		}
		
		
		System.out.println("100 : " + result[0] + " person");
		System.out.println("90 : " + result[1] + " person");
		System.out.println("80 : " + result[2] + " person");
		System.out.println("60 : " + result[3] + " person");
		System.out.println("40 : " + result[4] + " person");*/
	}
}
