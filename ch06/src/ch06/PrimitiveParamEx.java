package ch06;

class Data { int x; }

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x); 
						// 원본의 값                                  				       사본의 값
		change(d.x);	// d.x의 값이 변경된 것이 아니라, change method의 매개변수 x의 값이 변경됨.
						// PrimitivePrameter는 변수의 저장된 값을 읽을 수만 있음 . 변경x
		System.out.println("After change(d.x)" + d.x);
		System.out.println("main() : x = " + d.x);
	}

	 static void change(int x) {	// PrimitivePrameter 기본형매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
		
	}
}
