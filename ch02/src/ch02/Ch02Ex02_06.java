package ch02;

import java.util.*;

public class Ch02Ex02_06 {
	public static void main(String[] args) {
		/* 1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.
		야드와 인치를 키보드로 입력받아 각각 cm로 변환하여 다음 형식에 맞추어 소수
		첫째자리까지 출력하시오.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("야드 값과 인치 값을 입력해주세요");
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		float yd = Float.parseFloat(input1);
		float in = Float.parseFloat(input2);
		double ydToCm = yd*91.44;
		double inToCm = in*2.54;
		
		System.out.printf("%.0fyd = %5.1fcm%n", yd, ydToCm);
		System.out.printf("%.0fin = %5.1fcm%n", in, inToCm);
	}
	
	

}