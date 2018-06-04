package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {

	public static void main(String[] args) {
		double kor, mat , eng;
		int sum;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("실수로 된 3과목의 점수 입력");
		
		String[] numbers = scanner.nextLine().split(" ");
		kor = Double.parseDouble(numbers[0]);
		mat = Double.parseDouble(numbers[1]);
		eng = Double.parseDouble(numbers[2]);
		
		sum = (int)kor + (int)mat + (int)eng;
		avg = (kor + mat + eng)/3;
		System.out.printf("sum %d%navg %d", sum, (int)avg);

	}

}
