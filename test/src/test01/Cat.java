package test01;

public class Cat implements Action {
	private String name;
	private int age;
	
	public static void pr(Object o) {
		System.out.println(o);
	}
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override //annotation
	public void sleep() {
		pr("고양이 " + this.name + "가 잡니다.");

	}

	@Override
	public void run() {
		pr("고양이 " +this.name + "가 뜁니다.");

	}

	@Override
	public void walk() {
		pr(this.age + "살 고양이 " + this.name + "가 걷습니다.");

	}

	@Override
	public void wakeUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void breakUp() {
		// TODO Auto-generated method stub

	}

}
