package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {

	public static void main(String[] args) {
		/*2.2. 100 이하의 양의 정수만 입력된다. while 문을 이용하여 1부터 입력받은 정수까지의 합을
		구하여 출력하는 프로그램을 작성하시오.*/
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		/*for(int i = 1; i <= num; i++) {
			sum += i;
		}*/
		if (0<num && num<=100) {
			int i = 1;
			while(i <= num) {
				sum += i;
				i++;	
			}
			System.out.println(sum);
		
		}

	}

}
