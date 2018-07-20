package test01;

public class LoopTest {
	public static void main(String[] args) {
		/*for 시작과 끝
		while 종료 시점 설정*/
		for(int i = 1;i <= 10; i++) {
			//홀수,짝수 구분
			if(i % 2 == 0) {
				System.out.println(i+" 짝수");
			}else {
				System.out.println(i+" 홀수");
			}
		}		
	}
}
