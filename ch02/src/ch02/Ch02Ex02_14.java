package ch02;

import java.util.Scanner;

public class Ch02Ex02_14 {

	public static void main(String[] args) {
		/*실수의 yard(야드)를 입력받아 cm(센티미터)로 환산하여 입력값과 환산한
		값을 출력 예와 같이 소수 둘째자리에서 반올림하여 첫째자리까지 출력하는
		프로그램을 작성하시오. (단 1야드 = 91.44cm로 한다.)
		실수는 "double"로 하세요.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("yard? ");
		
		String input = scanner.nextLine();
		double yrd = Double.parseDouble(input);
		double yrdtocm = yrd*91.44;
		
		System.out.printf("%.1fyard = %.1fcm",yrd,yrdtocm);
	}

}
