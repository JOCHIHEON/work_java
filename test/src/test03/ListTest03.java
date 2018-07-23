package test03;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest03 {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		
		
		for (int i = 0; i < 10; i++) {
			int num = (int)(Math.random() * 30)+1;// 반복문 1~30까지 랜덤숫자
			String str = num + ""; // 총 10개 strList에 추가
			if(str.length()<2) {
				str = "0" + str; //		zeroSum
			}
			strList.add(str);	
		}
		
		Collections.sort(strList);
		for (int i = 0; i < 10; i++) {
			System.out.println(strList.get(i));
		}
	}
}
