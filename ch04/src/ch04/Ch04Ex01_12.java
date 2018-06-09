package ch04;

import java.util.Scanner;

public class Ch04Ex01_12 {
	public static void main(String[] args) {
		/*1.12. 년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을
		작성하시오.
		400으로 나누어 떨어지면 윤년이다.
		또는 4로 나누어 떨어지고 100으로 나누어 떨어지지 않으면 윤년이다.
		나머지는 모두 평년이다.*/

		int year;
		String result = " ";
		Scanner scanner = new Scanner(System.in);
		
		year = scanner.nextInt();
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			result = "leap year";
		}else {
			result = "common year";
		}
		System.out.println(result);

	}

}
