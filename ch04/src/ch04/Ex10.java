package ch04;

public class Ex10 {
	public static void main(String[] args) {
		/*[4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
		완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1)
		에 알맞은 코드를 넣으시오.
		[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.*/
		
		int num = 12345;
		int sum = 0;

		// num을 10으로 나눈 몫이 0이 될때까지 반복
		while (num != 0) {
			// num을 10으로 나눈 나머지는 현재 num의 일의자리 숫자이다.
			// 일의자리 숫자를 sum 변수에 저장
			sum += num % 10;

			// 현재 num을 10으로 나눈 값을 다시 num 변수에 저장
			// 일의자리에 있던 숫자가 지워진다.
			num /= 10;
		}

		System.out.println("sum="+sum);
	}

}
