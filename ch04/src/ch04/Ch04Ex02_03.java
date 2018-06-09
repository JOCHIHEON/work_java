package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String[] args) {
		/*2.3. 한 개의 정수를 입력받아 양수(positive integer)인지 음수(negative number)인지
		출력하는 작업을 반복하다가 0이 입력되면 종료하는 프로그램을 작성하시오.*/
		int num = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		while (num != 0) {
			System.out.println("정수를 입력하세요. (0: 종료) >");
			num = scanner.nextInt();
			if (0 < num) {		
				System.out.println("positeive integer");
			} else if(num < 0){
				System.out.println("negative number");
			}
		}
	}

}
