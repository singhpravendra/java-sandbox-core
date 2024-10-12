/**
 * 
 */
package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author pravendra.singh
 *
 */
public class Frequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List ls =  new ArrayList();
		ls.add("A");
		ls.add("A");
		ls.add("A");
		ls.add("A");
		ls.add("A");
		ls.add("A");
		System.out.println(Collections.frequency(ls, "A"));

	}

}
