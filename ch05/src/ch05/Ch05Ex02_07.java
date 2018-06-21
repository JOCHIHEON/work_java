package ch05;

import java.util.Scanner;

public class Ch05Ex02_07 {
	public static void main(String[] args) {
		int max = 0, min = 0;
		int[] num = new int[2];
		while(true) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if (!(Integer.parseInt(input) < 1000)) {
				// main 메소드를 return 시켜 프로그램 종료
				return;
			}
			else if(Integer.parseInt(input) == 999) {
				break;
			}
			num[0] = Integer.parseInt(input);
			for (int i = 0; i < num.length; i++) {
				if (i == num.length) {	// Ch05Ex01_12
					int[] tmp = new int[num.length * 3];
					System.arraycopy(num, 0, tmp, 0, num.length);
					num = tmp;
				}
				num[i] = Integer.parseInt(input);
				max = max > num[i] ? max : num[i];
				min = min < num[i] ? min : num[i];
			}
		}


		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
