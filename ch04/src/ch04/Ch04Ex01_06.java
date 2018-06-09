package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {

	public static void main(String[] args) {
		/*1.6. 남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
		성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자), "BOY"(미성년남자),
		"GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.*/
		
		int num;
		char ch = ' ';
		
		Scanner scanner = new Scanner(System.in);
		
		String[] s = scanner.nextLine().split(" ");
		
		ch = s[0].charAt(0);
		num = Integer.parseInt(s[1]);
		
				
		switch(ch) {
			case 'M' :
				if(num>=18) {
					System.out.println("MAN");
					break;
				} else {
					System.out.println("BOY");
					break;
				}
			case 'F' :
				if(num>=18) {
					System.out.println("WOMAN");
					break;
				} else {
					System.out.println("GIRL");
					break;
				}
		
		}
	}

}
