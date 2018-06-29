package ch06;

class IntitTest {
	int x;		// 인스턴스 변수 : x의 값은 0
	int y = x;	// 인스턴스 변수 : y의 값은 0, x값이 0
	
	void method1() {
		int i ;		// 지역변수 : 현재 i값은 알수없음
//		int j = i;	// 에러. 지역변수 초기화 x
	}
}
