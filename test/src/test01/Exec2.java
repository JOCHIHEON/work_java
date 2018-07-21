package test01;

public class Exec2 {
	
	public static void printObject(Action a) {
		a.run();
		a.walk();
		a.sleep();
	}
	
	public static void main(String[] args) {
		Person p = new Person("홍길동", 33);
		printObject(p);
		Cat c = new Cat("냥냥충", 3);
		printObject(c);
		Dog d = new Dog("멍멍충", 5);
		printObject(d);
	}
	/*public static void main(String[] args) {
		Action a = new Person("홍길동", 33);
		a.sleep();
		a.run();
		a.walk();
		
		a = new Cat("동동이", 5);
		a.sleep();
		a.run();
		a.walk();
	}*/
}