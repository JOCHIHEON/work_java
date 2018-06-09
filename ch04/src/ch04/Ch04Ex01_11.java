package ch04;

import java.util.Scanner;

public class Ch04Ex01_11 {
	public static void main(String[] args) {
		/*1.11. 정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력하는
		프로그램을 작성하시오.*/
		int num;
		String result = " ";
		Scanner scanner = new Scanner(System.in);
		
		num = scanner.nextInt();
		
		if(num==0) {
			result = "zero";
		} else if(0<num){
			result = "plus";
		} else {
			result = "minus";
		}
		System.out.println(result);
	}

}
