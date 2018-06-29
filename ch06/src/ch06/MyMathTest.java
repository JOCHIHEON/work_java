package ch06;

class MyMath {
//               method의 parameter
		long add (long a, long b) { 
//			long result = a + b;
//			return result;	// 위의 두줄을 이와 같이 한줄로 간단히 할수있다.
			return a + b;	
	} 	 // 선언부				// 구현부
//	         반환타입 메서드이름  // method 호출시 수행될 코드 
//		void power() { power = !power; } // void : 반환값없음
		
					  // 인자(argument,원본) argument의 타입은 parameter와 일치하거나 자동형변환이 가능해야함. 
		long subtract (long a, long b) { return a - b; }
		long multiply (long a, long b) { return a * b; }
		double divide (double a, double b) { return a / b; }
}

class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
						   // 매개변수(parameter,사본) 
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.divide(5L, 3L); // divide method가 반환한 결과를 사용하지 않아도 된다.
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}