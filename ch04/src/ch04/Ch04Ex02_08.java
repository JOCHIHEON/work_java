package ch04;

import java.util.Scanner;

public class Ch04Ex02_08 {
	public static void main(String[] args) {
		/*2.8. 정수를 입력받다가 0 이 입력되면 그 때까지 입력받은 홀수의 개수와 짝수의 개수를
		출력하는 프로그램을 작성하시오.*/



		int odd = 0, even = 0;

		while(true) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			if(0 < num && num % 2 == 0) {
				even++;
			} else if (num != 0){
				odd++;
			}
			if(num == 0) {
				break;
			}
		} 
		System.out.printf("odd: %d%neven: %d", odd, even);

	}

}
