package ch04;

import java.util.Scanner;

public class Ch04Ex02_15 {
	public static void main(String[] args) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		num= Integer.parseInt(scanner.nextLine()); // 3
		int endNum=num*2-1; // 5
		int centerNum=endNum/2+1;	// 3
		
		for(int i=1;i<=endNum;i++) {
			// i는 중간 Num까지는 별 증가 i=1,2,3
			if(i<=centerNum) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
			}
			// i는 중간이후 별 감소
			else { // i가 4일때 2개출력
				   // i가 5일때 1개출력
				for(int j=i;j<=endNum;j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
	}	
}
