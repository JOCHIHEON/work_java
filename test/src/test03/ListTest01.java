package test03;

import java.util.ArrayList;

public class ListTest01 {
//	
	static int getNum() {
		return 1;
	}

	public static void main(String[] args) {
//		String 배열
//		String[] arr = new String[3];
		String[] arr = {"1", "2", "3"};
		
//		String 리스트
		ArrayList<String> al;
		al = new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		
		int s = getNum();
		System.out.println(s);
		System.out.println(getNum());
		
		System.out.println(arr[0].toString());
		System.out.println(al);
	}
}
