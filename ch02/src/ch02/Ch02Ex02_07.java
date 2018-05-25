package ch02;

import java.util.*;

public class Ch02Ex02_07 {
	public static void main(String [] args) {
		/* 키를 입력받아 출력하는 프로그램을 작성하라.
		(입력할때 "height = " 문장을 먼저 출력하고 키를 입력 받아야 합니다.)
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("height = ");
		
		String input = scanner.nextLine();
		
		float height = Float.parseFloat(input);
		
		System.out.printf("Your height is %.0fcm.", height);
	}
		
}