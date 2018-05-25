package ch02;

import java.util.*;

public class Ch02Ex02_11 {

	public static void main(String[] args) {
		/*실수형 변수를 2개 선언한 후 각각 키보드로 입력받아 두 수의 합을 구하여
		각각의 숫자를 10칸씩 오른쪽에 맞추어 소수 둘째자리까지 출력하는 프로그램을
		작성하시오.
		*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두개의 실수를 입력해주세요.>");

		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		float f1 = Float.parseFloat(input1);
		float f2 = Float.parseFloat(input2);
		
		System.out.printf("%10.2f%10.2f%10.2f", f1, f2, f1+f2);

	}

}
