package ch05;

public class ArrayEx20 {
	public static void main(String[] args) {
		char[][] star = {
				 {' ',' ','*',' ',' '},{' ','*','*','*',' '},{'*','*','*','*','*'}
			};
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
	}

}
