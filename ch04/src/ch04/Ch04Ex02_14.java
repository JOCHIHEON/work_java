package ch04;

import java.util.Scanner;

public class Ch04Ex02_14 {

	public static void main(String[] args) {
		/*2.14. 2부터 9까지의 수 중 2개를 입력받아 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.
		단, 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다.*/
		int high = 0, row = 0;
		Scanner scanner = new Scanner(System.in);
		
		high = Integer.parseInt(scanner.nextLine());
		row = Integer.parseInt(scanner.nextLine());
		
		for(int i = 1; i <= 9; i++) {
			for(int j = high; j >= row; j--) {
				System.out.printf("%d * %d = %d	", j, i, i*j);
			}
			System.out.println();
		}
		
	}

}
