package ch04;

import java.util.Scanner;

public class Ex00 {

	public static void main(String[] args) {
		int num = 0;

		System.out.print("*을 출력할 라인의 수를 입력하세요. >");

		Scanner scanner = new Scanner(System.in);
		num = Integer.parseInt(scanner.nextLine());

		/*// 행의 수 만큼 반복
		for (int i = 0; i < num; i ++) {
			// 열의 수 만큼 반복
			for (int j = 0; j < num; j ++) {
				// 현재 찍을 곳이
				if (j >= i) {
					System.out.print("*");
				}
				// 그 외는 빈칸인 경우이므로 빈칸 찍기
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}*/

	
		 for (int i = 0; i < num; i++) {			// 행 개수
			for (int j = 0; j < i; j++) {		// 한줄에 공백 출력 횟수
				System.out.print(" ");
			}
			for (int j = num; j > i; j--) {		// 한줄에 별 출력 횟수
				System.out.print("*");
			}
			System.out.println();

			}

		}
}
