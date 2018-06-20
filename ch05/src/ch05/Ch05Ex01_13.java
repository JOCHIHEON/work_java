package ch05;

public class Ch05Ex01_13 {
	public static void main(String[] args) {
		int[][] result = {
				{5, 8, 10, 6, 4},
				{10, 20, 1, 13, 2},
				{7, 9, 14, 22, 3}
			};
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%2d   ", result[i][j]);
			}
			System.out.println();
		}
	}
} 