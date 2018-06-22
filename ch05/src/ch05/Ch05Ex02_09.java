package ch05;

import java.util.Scanner;

public class Ch05Ex02_09 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		int i = 0;
		int count = 0;
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			if(num == 0) {
				break;
			}
			else {
				numbers[i] = num;
				count++;
			}
		i++;	
		}
		
		System.out.println(count);
		
		for (int j = 0; j < count; j++) {
			
			if(numbers[j] % 2 == 0) {
				System.out.print(numbers[j] / 2 + " ");
			}
			else {
				System.out.print(numbers[j] * 2 + " ");
			}
			
		}
	}
}

