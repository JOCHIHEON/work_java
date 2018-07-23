package test03;

import java.util.ArrayList;

public class Exec {
 
	public static void main(String[] args) {
		/*Person p1 = new Person();
		p1.setName("조치헌");
		System.out.println(p1.getName());
		p1.setAge(23);
		System.out.println(p1.getAge());
		p1.setPoint(1000);
		System.out.println(p1.getPoint());
		
		System.out.println(p1.getName() + ", " + p1.getAge() + ", " + p1.getPoint());*/
		
		ArrayList<Person> pList = new ArrayList<Person>();
		/*Person p = new  Person();
		System.out.println(p.getName());
		pList.add(p);
		p.setName("홍길동");
		p = new Person();
		p.setName("김철수");
		System.out.println(pList.get(0).getName());
		System.out.println(p.getName());*/
			
		for (int i = 0; i < 5; i++) {
			Person p = new Person();
			pList.add(p);
			p.setName("테스트"+(i+1));
			p.setAge((i+1)*10);
			p.setPoint((i+1)*1000);
			System.out.println(p.getName()+","+p.getAge()+","+p.getPoint());
		}
		
		/*for (int i = 0; i < 5; i++) {
			String name = "테스트" + (i+1);
			int age = (i+1) * 10;
			Person p = new Person();
			p.setName(name);
			p.setAge(age);
			pList.add(p);
		}
		for (int i = 0; i < 5; i++) {
			Person p = pList.get(i);
			System.out.println(p.getName() + "," + p.getAge());
		}*/
		}
}