package ch05;

import java.util.Scanner;

public class Ch05Ex02_06 {
	public static void main(String[] args) {
		char[] apple = {'A', 'P', 'P', 'L', 'E','!'};
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		char ch = input.charAt(0);
		
		// int count = 0;
		boolean isFind = false;
		for (int i = 0; i < apple.length; i++) {
			if(ch == apple[i]) {
				isFind = true;
				System.out.println(i + " ");
				// count++;
			}
		}
		if(isFind == false) {
				System.out.println("none");
		}
	}
}
