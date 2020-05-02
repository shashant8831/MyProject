package in.co.collection;

import java.util.*;

public class TestSet {

	enum Example {
		ONE, TWO, THREE
	}

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add(Example.THREE);
		coll.add(Example.THREE);
		coll.add(Example.THREE);
		coll.add(Example.TWO);
		coll.add(Example.TWO);
		coll.add(Example.ONE);
		Set set = new HashSet(coll);
		System.out.println(coll);
	}

}
