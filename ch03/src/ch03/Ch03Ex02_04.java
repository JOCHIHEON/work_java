package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {

	public static void main(String[] args) {
		int minsooHeight, minsooWeight, kiyeongHeight, kiyeongWeight;
		boolean result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("민수의 키 몸무게,기영이의 키 몸무게를 입력해주세요.");
		// 1. 한줄에 두 입력받아 총 두 줄 입력받기 (정수 4개)
		String[] numbers01 = scanner.nextLine().split(" ");
		minsooHeight = Integer.parseInt(numbers01[0]);
		minsooWeight = Integer.parseInt(numbers01[1]);
		
		String[] numbers02 = scanner.nextLine().split(" ");
		
		kiyeongHeight = Integer.parseInt(numbers02[0]);
		kiyeongWeight = Integer.parseInt(numbers02[1]);
	
		boolean isGreatestMinsoo = minsooHeight > kiyeongHeight
				? (minsooWeight > kiyeongWeight ? true : false) : false;
	
		System.out.println(isGreatestMinsoo);
		
		/*
			System.out.println("민수의 키 몸무게,기영이의 키 몸무게를 입력해주세요.");
			
			weight1 = scanner.nextInt();
			height1 = scanner.nextInt();
			weight2 = scanner.nextInt();
			height2 = scanner.nextInt();
		
			result = (weight1>weight2) && (height2>height2);
		
			System.out.println(result);
		 */
	}

}
