package ch05;

import java.util.Scanner;

public class Ch05Ex01_05 {
	public static void main(String[] args) {
		double[] score = { 85.6, 79.5, 83.1, 78.2, 75.0};
		double sum = 0;
		Scanner scanner = new Scanner(System.in);	
		
		String[] input = scanner.nextLine().split(" ");
		
		int	class1 = Integer.parseInt(input[0]);
		int	class2 = Integer.parseInt(input[1]);
		
		
		sum = score[class1-1] + score[class2-1];
		
		System.out.printf("%.1f", sum);
	}
}
