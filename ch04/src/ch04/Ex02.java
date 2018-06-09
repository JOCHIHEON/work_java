package ch04;

public class Ex02 {
	public static void main(String[] args) {
		/*[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		int count = 0; // 몇 번 반복했는지 체크하기위한 변수
		 */
		// 총합을 저장하는 변수 sum 선언 및 초기화
		int sum = 0;

		// 1부터 20까지 정수를 활용하기 위해 반복
		for (int i = 1; i <= 20; i++) {
			// 만약 2의 배수도 아니고 3의 배수도 아니면
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;	// 총합을 저장하는 변수에 더하기
			}
		}

		// for문을 끝내고 총합을 출력: 73이 나오면 정답
		System.out.println("sum = " + sum);

	}

}
