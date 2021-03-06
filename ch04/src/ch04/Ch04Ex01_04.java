package ch04;

import java.util.Scanner;

public class Ch04Ex01_04 {
	public static void main(String[] args) {
		/*1.4. 복싱체급은 몸무게가 50.80kg 이하를 Flyweight, 61.23kg 이하를 Lightweight, 72.57kg
		이하를 Middleweight, 88.45kg 이하를 Cruiserweight, 88.45kg 초과를 Heavyweight라고
		하자.
		몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오.*/

		/*Scanner scanner = new Scanner(System.in);

		double weight = scanner.nextDouble();
		String title="";
		if(weight <= 88.45) {
			title = "Cruiserweight";
			if(weight <= 72.57) {
				title = "Middleweight";
				if(weight <= 61.23) {
					title = "Lightweight";
					if(weight <= 50.80) {
						title = "Flyweight";
					}
				}
			}
		} else {
			title = "Heavyweight";
		}
		System.out.println(title);*/

		// 1. 몸무게를 실수로 입력받기
		Scanner scanner = new Scanner(System.in);
		double weight = Double.parseDouble(scanner.nextLine());

		// 2. 체급별 메시지 출력하기
		if (weight <= 50.80) {
			System.out.println("Flyweight");
		}
		else if (weight <= 61.23) {
			System.out.println("Lightweight");
		}
		else if (weight <= 72.57) {
			System.out.println("Middleweight");
		}
		else if (weight <= 88.45) {
			System.out.println("Cruiserweight");
		}
		else if (weight > 88.45) {
			System.out.println("Heavyweight");
		}
	}

}
