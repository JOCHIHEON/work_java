package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {

	public static void main(String[] args) {
		double grade1, grade2;
		
		Scanner scanner = new Scanner(System.in);
		
		grade1 = scanner.nextDouble();
		grade2 = scanner.nextDouble();
		
		String grade = "";
		
		if(grade1>=4.0 && grade2>=4.0) {
			grade = "A";
		}else if (grade1>=3.0 && grade2>=3.0) {
			grade = "B";
		}else {
			grade = "C";
		}
		System.out.println(grade);
	}

}
