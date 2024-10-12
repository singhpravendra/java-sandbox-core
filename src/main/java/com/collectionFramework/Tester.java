/**
 * 
 */
package com.collectionFramework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pravendra.singh
 *
 */
public class Tester {
	
	public static void main(String[] args) {
		
		HashmapSorting hssort = new HashmapSorting();
		Map<String, String> hs = new HashMap<String, String>();
		Map<Integer, String> hsInt = new HashMap<Integer, String>();
		hs.put("ds", "dsvalue");
		hs.put("dsa", "bvalue");
		hs.put("r", "cvalue");
		hs.put("dfs", "hvaluye");
		hs.put("er", "kvalue");
		hs.put("q", "mvalue");
		hs.put("r", "rvalue");
		hs.put("A", "wcvak");
		hs.put("G", "sa");
		hs.put("f", "sdfafg");
		hs.put("g", "fgd");
		//hssort.sortBykeyAsc(hs);
		//hssort.sortBykeyDesc(hs);
		hsInt.put(1, "abc");
		hsInt.put(4, "abc");
		hsInt.put(2, "abc");
		hsInt.put(1, "abc");
		hsInt.put(1, "abc");
		hssort.sortByValue(hs);
	}

}
