package test01;

import java.util.ArrayList;

public class ListTest {
	private String[] strs = new String[0];
	private int size = 0;
	
	public boolean add(String s) {
		String[] tmps = strs;
		strs = new String[++size];
		for (int i = 0; i < tmps.length; i++) {
			strs[i] = tmps[i];
		}
		strs[size-1] = s;
		return true;
	}
	public int size() {
		return size;
	}
	public String get(int idx) {
		return strs[idx];
	}
	public String toString() {
		String str = "[";
		for (String s : strs) {
			str += s + ",";
		}
		str = str.substring(0, str.length()-1);
		str += "]";
		return str;
	}
	public int indexOf(String s) {
		for (int i = 0; i < strs.length; i++) {
			if(s.equals(strs[i])) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {/*
//		ArrayList al = new ArrayList(); // Data type을 지정하지 않으면 Object로 인식
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("abc");
		al.add("abc");
		al.add("abc");
		al.add("abc");
//		System.out.println(al);
		for(String str : al) {
			System.out.print(str);
		}
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i));
		}
		System.out.println(al.get(0) == al.get(1));*/
		ListTest lt = new ListTest();
		System.out.println(lt.size());
		lt.add("abc");
		lt.add("2");
		lt.add("abc");
		System.out.println(lt.size());
		System.out.println(lt);
		System.out.println(lt.indexOf("2"));
	}
}
