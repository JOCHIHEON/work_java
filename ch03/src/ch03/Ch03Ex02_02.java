package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {

	public static void main(String[] args) {
		
		int area, width, height;
		// 1. 두 정수 가로로 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("가로,세로 차례로 입력");
		String[] numbers = scanner.nextLine().split(" ");
		
		width = Integer.parseInt(numbers[0]);
		height = Integer.parseInt(numbers[1]);
		
		width += 5;
		height *= 2;
		
		area = width * height;
		
		System.out.println("width"+" = "+ width);
		System.out.println("height"+" = "+ height);
		System.out.println("area"+" = "+ area);
	}

}
