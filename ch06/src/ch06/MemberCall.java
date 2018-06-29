package ch06;

class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv; 		// instance변수가  static변수를 사용하는 것은 문제x
//	static int cv2 = iv // Cannot make a static reference to the non-static field iv
//						   static변수는 instance변수를 사용할 수 없음.
	static int cv2 = new MemberCall().iv;	// 이렇게 instance를 생성해야 instance변수를 참조가능.
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);	// Cannot make a static reference to the non-static field iv
//				                   static method에서 instance변수 사용불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // instance를 생성한 후에 instance변수 참조가능.
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);	// instance method 에서는  instance변수, class(static)변수 모두 바로 사용가능
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();		// class(static) method에서는 instance method 사용 불가.
		MemberCall c = new MemberCall();
		c.instanceMethod1();
		
	}
	
	void instanceMethod2() {
		staticMethod1();	// 이미 memory 상에 올라가 있음.
		instanceMethod1();	// instance method 에서는  instance method, class(static) method 모두 바로 호출가능
	}
}
