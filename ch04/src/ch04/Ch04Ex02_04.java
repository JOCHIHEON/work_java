package ch04;

import java.util.Scanner;

public class Ch04Ex02_04 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		double avg = 0.0;
		double count = 0.0;
		Scanner scanner = new Scanner(System.in);
		while(num<100) {
			num = scanner.nextInt();
			sum += num;
			count++;
		}
		avg = sum / count;
		System.out.println(sum);
		System.out.printf("%.1f",avg);
	}
}