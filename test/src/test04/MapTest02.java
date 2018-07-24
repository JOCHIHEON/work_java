package test04;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest02 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("이름", "조치헌");
		map.put("나이", "23");
		map.put("주소", "서울 관악구");

		String name = map.get("이름");
		String age = map.get("나이");
		String address = map.get("주소");
		System.out.println(name+","+age+","+address);
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
	}
}

