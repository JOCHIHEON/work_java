package test01;

import java.util.ArrayList;
import java.util.List; // ArrayList, LinkedList의 공통부분을 가진 Interface

public class ArrayListTest {
	
	public static void main(String[] args) {
		List<Integer> lottoList = new ArrayList<Integer>();
		for(int i = 1; i <= 6; i++) {
			int lotto = (int)(Math.random()*45) + 1;
			if(lottoList.indexOf(lotto) != -1) {
				i--;
				continue;
			}
			lottoList.add(lotto);
		}
		
		for (int i = 0; i < lottoList.size(); i++) {
			System.out.println(i + 1 + " 번째 번호:" + lottoList.get(i));
		}
	}
}
