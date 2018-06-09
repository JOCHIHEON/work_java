package ch04;

import java.util.Scanner;

public class Ch04Ex02_06 {

	public static void main(String[] args) {
		/*2.6. 아래와 같이 나라 이름을 출력하고 숫자를 입력받아 해당하는 나라의 수도를 출력하는
		작업을 반복하다가 해당하는 번호 이외의 숫자가 입력되면 "none"라고 출력한 후 종료하는
		프로그램을 작성하시오.
		 * 각 나라의 수도 : 대한민국 = 서울(Seoul) / 미국 = 워싱턴(Washington) / 일본 = 동경(Tokyo) / 중국 = 북경(Beijing)*/
		/*int num = 1;
		String capital = " ";
		Scanner scanner = new Scanner(System.in);
		while (1 <= num && num <= 5) {
			System.out.println("1. Korea\n" + "2. USA\n" + "3. Japan\n" + "4. China\n" + "number?");
			num = 0;
			num = scanner.nextInt();
			switch(num) {
			case 1: capital = "Seoul";
			break;
			case 2: capital = "Washington";
			break;
			case 3: capital = "Tokyo";
			break;
			case 4: capital = "Beijing";
			break;
			default : capital = "none";		
			break;
			}*/
		int num = 0;
		String capital = " ";
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1. Korea\n" + "2. USA\n" + "3. Japan\n" + "4. China\n" + "number?");
			num = scanner.nextInt();
			switch(num) {
			case 1: capital = "Seoul";
			break;
			case 2: capital = "Washington";
			break;
			case 3: capital = "Tokyo";
			break;
			case 4: capital = "Beijing";
			break;
			default : capital = "none";		
			break;
			}
		}while (1 <= num && num <= 5);
				System.out.println(capital);		
	}

}
