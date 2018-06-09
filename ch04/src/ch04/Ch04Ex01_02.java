package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {

	public static void main(String[] args) {
		int height = 0;
		int weight = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요. >");
		
		height = scanner.nextInt();
		weight = scanner.nextInt();
		
		int obesity = weight+100-height;
		
		System.out.println(obesity);
		if(obesity>=0) {
			System.out.println("Obesity");
		}
		
		

	}

}
