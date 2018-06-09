package ch04;

import java.util.Scanner;

public class Ch04Ex01_13 {
	public static void main(String[] args) {
		/*1.13. 1번은 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을
		영어로 출력하는 프로그램을 작성하시오. 해당 번호가 없으면 "I don't know." 라고 출력한다.
		개-dog
		고양이-cat
		병아리-chick*/
		int num;
		String result = " ";

		Scanner scanner = new Scanner(System.in);
		System.out.println("번호를 입력하세요. >");
		num = scanner.nextInt();

		switch(num) {
		case 1 : result = "dog";
		break;
		case 2 : result = "cat";
		break;
		case 3 : result = "chick";
		break;
		default : result = "I don't know.";
		break;
		}
		System.out.println(result);
	}

}
