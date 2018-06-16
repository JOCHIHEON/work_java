package ch05;

public class ArrayEx05 {
	public static void main(String args[]) {
		int sum = 0;	// 총점 저장
		float avg = 0f;	// 평균 저장
		
		int[] score = {100, 88, 100, 100, 90};
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		avg = sum / (float)score.length;	// 계산결과를 float으로 얻기 위함.
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
