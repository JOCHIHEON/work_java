package ch06;

class Tv { // The type Tv is already defined
	// 같은 패키지 안에서는 클래스 재사용이 가능하다
	// Tv의 속성(멤버변수)
	String color;	// 색상
	boolean power;	// (on/off)
	int channel;	// channel

	// Tv의 기능(메서드)
	void power() { power = !power; }	// TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++ channel; }		// TV의 채널을 높이는 기능을 하는 메서드
	void channelDown() { --channel; }	// TV의 채널을 낮추는 기능을 하는 메서드
}