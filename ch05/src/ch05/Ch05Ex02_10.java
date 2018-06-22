package ch05;

import java.util.Scanner;

public class Ch05Ex02_10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine()); 
		if(n>20) {
			return;
		}
		else {
			int[] score = new int[n];
			Scanner input = new Scanner(System.in);
			String[] tmp = input.nextLine().split(" ");
			for (int i = 0; i < score.length; i++) {
				score[i] = Integer.parseInt(tmp[i]);
			}
			for (int i = 0; i < score.length - 1 ; i++) {
				boolean changed = false;	// 자리바꿈이 발생했는지 체크한다.
				
				for (int j = 0; j < score.length - 1 - i; j++) {
					if (score[j] < score[j + 1]) { // 옆의 값이 작으면 서로 바꾼다.
						int temp = score[j];
						score[j] = score[j + 1];
						score[j + 1] = temp;
						changed = true;	// 자리바꿈이 발생했으니 changed를 true로.
					}
				}
				if (!changed) break;	// 자리바꿈이 없으면 반복문을 벗어난다.
			}
			for (int k = 0; k < score.length; k++) {
				System.out.println(score[k]);	// 정렬된 결과를 출력한다.
			}
		}
		
	}
}
