package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {

	public static void main(String[] args) {
		/*1.7. 영문 대문자를 입력받아 'A'이면 “Excellent”, 'B'이면 “Good”, 'C'이면 “Usually”,
		'D'이면 “Effort”, 'F'이면 “Failure”, 그 외 문자이면 “error” 라고 출력하는 프로그램을
		작성하시오.*/
		String evaluation = " ";
		char ch = ' ';
		
		Scanner scanner = new Scanner (System.in);
		
		ch = scanner.nextLine().charAt(0);
		
		switch(ch) {
			case 'A' :
				evaluation = "Excellent";
				break;
			case 'B' :
				evaluation = "Good";
				break;
			case 'C' :
				evaluation = "Usually";
				break;
			case 'D' :
				evaluation = "Effort";
				break;
			case 'F' :
				evaluation = "Failure";
				break;
		default :
				System.out.println("error");
				break;
		}
		System.out.println(evaluation);
		
		
	

	}

}
