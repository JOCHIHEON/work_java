package ch04;

import java.util.Scanner;

public class Ch04Ex02_10 {
	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			num = scanner.nextInt();
			if(num == 0){
				break;
			} else if(num % 3 == 0 || num % 5 == 0) {
				count++;
			}
		}
		System.out.println(count);

	}
}
