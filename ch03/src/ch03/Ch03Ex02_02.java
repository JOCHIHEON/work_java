package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {

	public static void main(String[] args) {
		
		int area, width, height;
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("가로,세로 차례로 입력");
		
		width = scanner.nextInt();
		height = scanner.nextInt();
		
		width = width+5;
		height = height*2;
		
		area = width * height;
		
		System.out.println("width"+" = "+width);
		System.out.println("height"+" = "+height);
		System.out.println("area"+" = "+area);
	}

}
