/**
 * 
 */
package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author pravendra.singh
 *
 */
public class Tester {

	int id;
	String name;
	public static void main(String[] args) {
		Tester t1= new Tester();
		Tester t2= new Tester();
		t1.id=1;
		t1.name="ABC";
		t2.id=1;
		t2.name="ABC";
		
		Set hs = new HashSet<>();
		
		Map hm = new HashMap();
		
		hs.add(t1);
		hs.add(t2);

		hm.put("abc", t1);
		hm.put("abc", t2);
		
		System.out.println(hs.size());
		System.out.println(hm.size());
	}

}
