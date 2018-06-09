package ch04;

public class Ex11 {

	public static void main(String[] args) {
		/*[4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가
		는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는
		1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터
		시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
		*/
		
		// [방법 1]
		// i는 행, j는 열
		/*for (int i = 1; i <= 9; i++) {
					for (int j = 1; j <= 3; j++) {
						int x = (j + 1) + ((i - 1) / 3) * 3;
						int y = i % 3 == 0 ? 3 : i % 3;

						if (x < 10) {
							System.out.printf("%d*%d=%d\t", x, y, x * y);
						}
					}
					System.out.println();
					if (i % 3 == 0) {
						System.out.println();
					}
				}*/

		// [방법 2]
		for (int i = 1; i <= 3; i++) {
			for (int j = 2; j <= 4; j++) {
				System.out.printf("%d*%d=%d\t", j, i, j * i);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 3; i++) {
			for (int j = 5; j <= 7; j++) {
				System.out.printf("%d*%d=%d\t", j, i, j * i);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 3; i++) {
			for (int j = 8; j <= 9; j++) {
				System.out.printf("%d*%d=%d\t", j, i, j * i);
			}
			System.out.println();
		}
		System.out.println();

	}

}
