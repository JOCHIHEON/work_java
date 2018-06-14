package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {

	public static void main(String[] args) {
		int base = 0, height = 0;
		double triArea;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Base = ");
			base = Integer.parseInt(scanner.nextLine());
			
			System.out.print("height = ");
			height = Integer.parseInt(scanner.nextLine());
			
			triArea = base * height / 2.0;
			System.out.printf("Triangle area = %.1f%n", triArea);
			
			System.out.print("Continue?");
			String answer = scanner.nextLine();
		
		/*	if(ch == 'y' || ch == 'Y'){
				continue;
			} else {
				break;
			}*/
			
			if(answer.equalsIgnoreCase("Y")) {
				break;
			}
			
		}
		
		
	}

}
