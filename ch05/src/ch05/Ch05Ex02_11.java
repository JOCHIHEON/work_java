package ch05;

import java.util.Scanner;

public class Ch05Ex02_11 {
	public static void main(String[] args) {
		
		int[] throwDice = new int[10];
		Scanner scanner = new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" ");
		for (int i = 0; i < throwDice.length; i++) {
			throwDice[i] = Integer.parseInt(tmp[i]);
		}
		int[] diceValue = new int[6];
		for (int i = 0; i < tmp.length; i++) {
			for (int j = 0; j < diceValue.length; j++) {
				if(throwDice[i] == j+1) {
					diceValue[j]++;
				}
			}
			
		}
		for (int j = 0; j < diceValue.length; j++) {
			System.out.printf("%d : %d%n", j + 1, diceValue[j]);
		}

	}
}
