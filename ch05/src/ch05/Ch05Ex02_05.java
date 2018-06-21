package ch05;

import java.util.Scanner;

public class Ch05Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] weight = new double[6];
		double sum = 0.0;
		String[] input = scanner.nextLine().split(" ");
		
		for (int i = 0; i < input.length; i++) {
			weight[i] = Double.parseDouble(input[i]);
			sum += weight[i];
		}
		
		double avg = sum / weight.length;
		
		System.out.printf("%.1f",avg);
	}
}
