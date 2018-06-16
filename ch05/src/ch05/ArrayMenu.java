package ch05;

import java.util.Scanner;

public class ArrayMenu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] menu = {"쭈꾸미","회덮밥","쌀국수","메뉴를 다시 선택하세요"};
		System.out.println("How much Count? >");
		int count = Integer.parseInt(scanner.nextLine());
		int countDown = count;
		System.out.println("COUNTDOWN");
		for (int i = 0; i < count; i++) {
			int n = (int)(Math.random() * 4);
			String tmp = menu[0];
			menu[0] = menu[n];
			menu[n] = tmp;
			countDown--;
			System.out.printf("%d%n", countDown);
		}
		
		System.out.println("두둥!! 대망의 오늘 메뉴는? : "+ menu[0]);
	}

}
