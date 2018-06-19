package ch05;

import java.util.Scanner;

public class Ch05Ex01_08 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int evenSum = 0;
		int oddSum = 0;
		int sum = 0;
		double avg = 0;
		double oddCount = 0.0;
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(inputs[i]);
			if(i % 2 == 0) {
				oddSum += num[i];
				oddCount++;
			} else {
				evenSum += num[i];
			}	
		}
		
		sum = evenSum;
		avg = oddSum / oddCount;
		
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
		
	}
}
