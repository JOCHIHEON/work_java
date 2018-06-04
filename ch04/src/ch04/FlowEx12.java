package ch04;

public class FlowEx12 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);	// i 의 값 출력
		}

		for (int i = 1; i <= 5; i++) {
			System.out.print(i);	// println()대신 print() 를 쓰면 가로로 출력된다.
		}
		System.out.println();
	}

}
