package ch02;

import java.util.*;

public class Ch02Ex02_05 {

	public static void main(String[] args) {
		/*다음 두 값을 키보드로 입력받아 곱셈 계산식을 출력하는 프로그램을
		작성하라. (소수는 Float.parseFloat()을 이용하여 String을 float으로 변경)
		추의 무게 = 49, 중력의 비율 = 0.2683
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("추의 무게 49, 중력의비율 0.2683을 키보드로 입력해주세요");
		
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(input1);
		float num2 = Float.parseFloat(input2);
		float mul = (num1*num2);
		
		
		System.out.printf("%d x %f = %f", num1, num2, mul);
	}

}
