package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요. >");
		String[] numbers = scanner.nextLine().split(" ");		
		int height = Integer.parseInt(numbers[0]);
		int weight = Integer.parseInt(numbers[1]);
		
		int obesity = weight+100-height;
		
		System.out.println(obesity);
		
		if(obesity>=0) {
			System.out.println("Obesity");
		}
	}

}
