package ch02;

import java.util.*;

public class Ch02Ex02_12 {

	public static void main(String[] args) {
		/*정수형 변수 한 개를 선언하여 50을 키보드로 입력받고 실수형 변수 한 개를
		선언하여 100.12를 키보드로 입력받아 다음과 같이 출력되는 프로그램을
		작성하시오.
		(결과값은 소수점 이하에서 반올림)
		*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("50과 100.12를 차례로 입력해주세요.");
		
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		int i = Integer.parseInt(strNum1);
		float f = Float.parseFloat(strNum2);
		float mul = f*i;
		
		System.out.printf("%.2f * %d = %.0f",f,i,mul);

	}

}
