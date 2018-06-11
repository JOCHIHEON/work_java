package ch04;

import java.util.Scanner;

public class Ch04Ex02_09 {
	public static void main(String[] args) {
		int num = 0, sum = 0, count = 0;
		double avg;
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			num = scanner.nextInt();
			if(0 <= num && num <= 100) {
				sum += num;
				count++;
			}else {
				break;
			}
		}
		avg = sum/(double)count;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
	}

}
