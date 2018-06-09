package ch04;

import java.util.Scanner;

public class Ch04Ex01_08 {

	public static void main(String[] args) {
		/*1.8. 
		4.5 이하의 평점을 입력받아 그 값에 따라 다음과 같이 출력하는 프로그램을 작성하시오.
		단, 입력은 0이상 4.5 이하이다. (switch문 사용)
		4.0 이상 : "scholarship"
		3.0 이상 : "next semester"
		2.0 이상 : "seasonal semester"
		2.0 미만 : "retake"
		실수를 정수형(int)으로 변환하여 분기한다. (예 - switch( (int)score ))*/

		double score;
		String result;
		Scanner scanner = new Scanner(System.in);

		score = scanner.nextDouble();
		
			switch((int)score) {
			case 4 : result =  "scholarship";
				break;
			case 3 : result =  "next semester";
				break;
			case 2 : result =  "seasonal semester";
				break;
			case 1 :
			case 0 : result = "retake";
				break;

			default : result = "";
				break;
			}
			System.out.println(result);
	}

}
