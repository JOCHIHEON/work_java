package ch04;

import java.util.Scanner;

public class Ch04Ex02_16 {

	public static void main(String[] args) {
		/*2.16. 자연수 n(n≤6)을 입력받아 n * n 크기에 “출력 예”와 같이 출력되는 프로그램을
		작성하시오.*/
		
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		char ch = 'A';
		int num = 0;
		n = Integer.parseInt(scanner.nextLine());
		for (int i = 1; i <= n; i++) {
				for(int j = n; j >= i; j --) {
					System.out.printf("%c", ch);
					ch++;
				}
				for(int j = 1; j < i; j ++) {
					System.out.printf("%d", num);
					num++;
				}
			System.out.println();
			
		}
		
	}

}
