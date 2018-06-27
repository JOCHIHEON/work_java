package ch06;

public class  ReferenceParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x); 
						// 원본의 값                                  				   사본의 값
		change(d);		// d.x의 값이 변경, change method의 참조형변수 d의 값(주소)이 변경됨.
						// ReferencePrameter는 변수의 저장된 값을 읽어오고 변경도 가능.
		System.out.println("After change(d)" + d.x);
		System.out.println("main() : x = " + d.x);
	}

	 static void change(Data d) {	// ReferencePrameter 참조형매개변수(값이 저장된 주소)
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
		
	}
}