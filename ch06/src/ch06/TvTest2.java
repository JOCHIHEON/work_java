package ch06;

public class TvTest2 {
	public static void main(String[] args) {
		
//		Tv t;				// Tv 인스턴스를 참조하기 위한 변수 t를  선언
//		t = new Tv();		// Tv 인스턴스 생성
		
		Tv t1 = new Tv();	// 위의 두 문장을 한문장으로 가능. Tv두대 생성
		
		Tv t2 = new Tv();
		System.out.println("t1의 channel1값은  " + t1.channel + "입니다.");
		System.out.println("t2의 channel1값은  " + t1.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7으로 변경하였습니다.");
		
		t1.channelDown();
		System.out.println("t1의 channel1값은  " + t1.channel + "입니다.");
		System.out.println("t2의 channel1값은  " + t2.channel + "입니다.");
	}
}
