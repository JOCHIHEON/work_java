package ch04;

import java.util.Scanner;

public class Ex00 {

	public static void main(String[] args) {
		int num = 5;

		/*System.out.print("*을 출력할 라인의 수를 입력하세요. >");

		Scanner scanner = new Scanner(System.in);
		num = Integer.parseInt(scanner.nextLine());*/

		// 행의 수 만큼 반복
		for (int i = 0; i < num; i ++) {
			// 열의 수 만큼 반복
			for (int j = 0; j < num; j ++) {
				// 현재 찍을 곳이
				if (j >= i) {
					System.out.printf("*[%d,%d]",i,j);
				}
				// 그 외는 빈칸인 경우이므로 빈칸 찍기
				else {
					System.out.printf(" [%d,%d]",i,j);
				}
			}
			System.out.println();
		}
		System.out.println("=============");


	
		 for (int i = 0; i < num; i++) {			
			for (int j = 0; j < i; j++) {		
				System.out.printf(" [%d,%d]",i,j);
			}
			for (int j = num; j > i; j--) {		
				System.out.printf("*[%d,%d]",i,j);
			}
			System.out.println();

		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf(" [%d,%d]",i,j);
			}
			for (int k = 0; k < 5-i; k++) {
					System.out.printf("*[%d,%d]",i,k);
			}
			System.out.println();
		}
	}
}
