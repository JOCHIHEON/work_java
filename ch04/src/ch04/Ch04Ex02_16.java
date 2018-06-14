package ch04;

import java.util.Scanner;

public class Ch04Ex02_16 {

	public static void main(String[] args) {
		/*2.16. 자연수 n(n≤6)을 입력받아 n * n 크기에 “출력 예”와 같이 출력되는 프로그램을
		작성하시오.*/
		
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		if (n > 6) {
			System.out.println("INPUT ERROR!");
			return;  
			/*특정 값을 리턴할 경우 사용하는 키워드
			 지금은 리턴타입이 void 이므로 특정 값이 없는 경우
			 main 메소드를 리턴하면 프로그램 종료와 같다.*/
		}
		
		char ch = 'A';
		int num = 0;
		/*for (int i = 1; i <= n; i++) {
				for(int j = n; j >= i; j --) {
					System.out.print(ch);
					ch++;
				}
				for(int j = 1; j < i; j ++) {
					System.out.print(num);
					num++;
				}
			System.out.println();
			*/
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(n-i > j) {
					System.out.print(ch + " ");
					ch++;
				} else {
					System.out.print(num + " ");
					num++;
				}
			}
			System.out.println();
			
		}
		
	}

}
