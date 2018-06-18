package ch05;

import java.util.Scanner;

public class Ch05Ex01_04 {
	public static void main(String[] args) {
		int[] num = new int[100];
		int tmp = 0;
		for (int i = 0; i < num.length; i++) {
			Scanner scanner = new Scanner(System.in);
			num[i] = Integer.parseInt(scanner.nextLine());
			if(num[i] == 0) {
				tmp = i;
				break;
			}
		}
		for (int j = tmp-1; j >= 0; j--) {
			System.out.print(num[j] + " ");
		}
		
	}

}
