package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {

	public static void main(String[] args) {
		int weight1, height1,weight2, height2;
		boolean result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("민수의 키 몸무게,기영이의 키 몸무게를 입력해주세요.");
		
		weight1 = scanner.nextInt();
		height1 = scanner.nextInt();
		weight2 = scanner.nextInt();
		height2 = scanner.nextInt();
	
		result = (weight1>weight2) && (height2>height2);
	
		System.out.println(result);
	}

}
