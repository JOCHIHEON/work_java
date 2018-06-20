package ch05;

import java.util.Scanner;

public class Ch05Ex01_09 {
	public static void main(String[] args) {
		// ArrayEx10 참고
		Scanner scanner = new Scanner(System.in);

		int[] num = new int[10];
		String[] inputs = scanner.nextLine().split(" ");
		for (int i = 0; i < inputs.length; i++) {
			num[i] = Integer.parseInt(inputs[i]);
		}

		for (int i = 0; i < inputs.length - 1; i++) {
			boolean changed = false;

			for (int j = 0; j < inputs.length - 1 - i; j++) {
				if (num[j] < num [j+1]) { // 옆의 갚이 더 크면 서로 바꾼다.
					int tmp = num [j+1];
					num[j+1] = num[j];
					num[j] = tmp;
					changed = true; // 자리바꿈 발생 changed를 true로 변경.
				}
			}
			if(!changed) break; // 자리바꿈 없으면 반복문 벗어남.
		}
		for(int k = 0; k < inputs.length; k++) {
			System.out.print(num[k] + " ");

	}
}
}
