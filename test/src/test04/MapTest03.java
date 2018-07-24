package test04;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest03 {

	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> aniList = new ArrayList<HashMap<String,String>>();
		
		HashMap<String,String> animal = new HashMap<String, String>();
		animal.put("동물이름", "강아지");
		animal.put("동물나이", "2");
		aniList.add(animal);
		
		animal = new HashMap<String, String>();
		animal.put("동물이름", "거북이");
		animal.put("동물나이", "3");
		aniList.add(animal);
		
		animal = new HashMap<String, String>();
		animal.put("동물이름", "고양이");
		animal.put("동물나이", "4");
		aniList.add(animal);
		
		animal = new HashMap<String, String>();
		animal.put("동물이름", "물개");
		animal.put("동물나이", "1");
		aniList.add(animal);
		
		for (HashMap<String,String> an : aniList) {
			System.out.println(an);
		}
		for (int i = 0; i < aniList.size(); i++) {
			System.out.println(aniList.get(i));
		}
	}
}
