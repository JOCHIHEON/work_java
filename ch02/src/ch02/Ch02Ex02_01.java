package ch02;

import java.util.*;
public class Ch02Ex02_01 {
	public static void main(String[] args) {
		/*다음 출력 예와 같이 출력되는 프로그램을 작성하시오.
		kor, mat, eng값은 Scanner 클래스의 nextLine()을 이용하여 입력받으세요.
		합계와 평균은 수식을 이용하세요.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("kor,mat,eng의 값을 차례로 입력해주세요.");
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);

		System.out.printf("kor %d%n", num1);
		System.out.printf("mat %d%n", num2);
		System.out.printf("eng %d%n", num3);
		System.out.printf("sum %d%n", num1+num2+num3);
		System.out.printf("avg %d%n", (num1+num2+num3)/3);
	}

}
