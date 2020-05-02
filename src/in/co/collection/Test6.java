package in.co.collection;

import java.util.*;

public class Test6 {

	private String s;

	public Test6(String s) {
		this.s = s;
	}

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		Test6 ws1 = new Test6("aardvark");
		Test6 ws2 = new Test6("aardvark");
		String s1 = new String("aardvark");
		String s2 = new String("aardvark");
		hs.add(ws1);
		hs.add(ws2);
		hs.add(s1);
		hs.add(s2);
		System.out.println(hs.size());
	}
}
