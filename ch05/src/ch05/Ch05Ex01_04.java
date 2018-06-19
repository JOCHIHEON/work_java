package ch05;

import java.util.Scanner;

public class Ch05Ex01_04 {
	public static void main(String[] args) {
		int[] num = new int[100];
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		String[] inputs = scanner.nextLine().split(" ");
		
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(inputs[i]);
			
			if(num[i] == 0) {
				count = i;
				break;
			}
		}
		for (int j = count-1; j >= 0; j--) {
			System.out.print(num[j] + " ");
		}
		
	}

}
