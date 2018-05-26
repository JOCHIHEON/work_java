package ch02;

import java.util.*;

public class Ch02Ex02_13 {

	public static void main(String[] args) {
		/*세 개의 정수를 입력받아 합과 평균을 출력하는 프로그램을 작성하시오.
		(단 평균은 소수 이하를 버림하여 정수 부분만 출력한다.)	
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 세개를 입력해주세요.");
		
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		String strNum3 = scanner.nextLine();
		
		int i1 = Integer.parseInt(strNum1);
		int i2 = Integer.parseInt(strNum2);
		int i3 = Integer.parseInt(strNum3);
		int sum = i1+i2+i3;
		System.out.printf("sum = %d%n", sum );
		System.out.printf("avg = %d%n", (sum)/3);

	}

}
