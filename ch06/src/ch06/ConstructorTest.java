package ch06;

class Data1 {
	int value;
	/*
	 * 기본 생성자 (Default Constructor)
	 * Constructor을 작성하지 않으면 기본으로
	 * 컴파일러가 알아서 생성하는 생성자
	 * 물론 아래와 같이 명시적을 작성한 후
	 * 바디부분(중괄호 안)에 코드를 작성하면
	 * 생성자 호출 시 코드가 실행이 된다.
	 */
	
	Data1() {
		System.out.println("Data1 constructor call");
	}
}

class Data2 {
	int value;
	
	/*
	 * Constructor생성자
	 * 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메소드이다.
	 * 
	 * 1. Constructor 이름은 클래스의 이름과 같아야한다.
	 * 2. Constructor는 리턴 값이 없다.
	 * 3. instance 생성 시점에 실행하고 싶은 코드를 작성하면 된다.
	 *    ex) instance 변수 값을 원하는 값으로 초기화 할 때
	 */
	Data2(int x) {	// parameter가 있는 Constructor
		value = x;
		System.out.println("Data2 constructor call");
	}
	
}


class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();	// constructor 앞에 new를 쓰면 instance를 만듬
		Data2 d2 = new Data2(30);	//compile error
		
		System.out.println("value of d1 instace : " + d1.value);
		System.out.println("value of d2 instace : " + d2.value);
	}
}
