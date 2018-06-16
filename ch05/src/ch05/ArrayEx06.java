package ch05;

public class ArrayEx06 {
	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];	// 배열의 첫 번째 값으로 최대값을 초기화한다
		int min = score[0];	// 배열의 첫 번째 값으로 최소값을 초기화한다
		
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {		// max가 score[0]일 때 [1]~[9]까지 모두 비교
				max = score[i];
			}
			else if (score[i] < min) {	// min가 score[0]일 때 [1]~[9]까지 모두 비교
				min = score[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
