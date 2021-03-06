package ch04;

public class Ex03 {

	public static void main(String[] args) {
		//[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		
		// [방법 1]: 55번 반복
		/*int sum = 0;

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				sum += j;
				count++;
			}
		}

		System.out.println(sum);
		System.out.println(count);*/

		// [방법 2]: 10번 반복
		int sum = 0;		// 괄호 안의 부분 합
		int totalSum = 0;	// 총합
		int count = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
			totalSum += sum;
			count++;	// 반복문을 몇번 수행했는지 체크
		}

		System.out.println(totalSum);
		System.out.println(count);

	}

}
