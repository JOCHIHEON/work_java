package ch04;

public class FlowEx26 {
	public static void main(String[] args) {
		int sum= 0;
		int i = 0;
		
		// sum의 결과가 100 이하일 때까지 반복
		while ((sum += ++i) <= 100) {	// i를 증가시켜서 sum에 계속 더해나간다.
			System.out.printf("%d - %d%n", i, sum);
		}
	}

}
