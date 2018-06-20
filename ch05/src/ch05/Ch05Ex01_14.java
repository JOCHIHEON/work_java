package ch05;

import java.util.Scanner;

public class Ch05Ex01_14 {
	public static void main(String[] args) {
		int[][] arr1 = new int[2][4];
		int[][] arr2 = new int[2][4];
		
		System.out.println("first array");
		
		for (int j = 0; j < arr1.length; j++) {
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			for (int i = 0; i < numbers.length; i++) {
				arr1[j][i] = Integer.parseInt(numbers[i]);
			}
		}
		
		System.out.println("second array");
		
		for (int j = 0; j < arr2.length; j++) {
			Scanner scanner = new Scanner(System.in);
			
			String[] numbers = scanner.nextLine().split(" ");

			for (int i = 0; i < numbers.length; i++) { 
				arr2[j][i] = Integer.parseInt(numbers[i]);
			}
		}
		
		
		for (int i = 0; i < arr1.length; i++) { // 행
			for (int j = 0; j < arr1[i].length; j++) { // 열
				System.out.print(arr1[i][j] * arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
