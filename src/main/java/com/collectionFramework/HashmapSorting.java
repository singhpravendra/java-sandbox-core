/**
 * 
 */
package com.collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author pravendra.singh
 *
 */
public class HashmapSorting {
	
	
	//Map key sorting ascending order
	public void sortBykeyAsc(Map<String,String> map){
		System.out.println("Map sorting in Ascending");
		TreeMap<String,String> tmap = new TreeMap(map);
		for(Map.Entry entry : tmap.entrySet()){
			System.out.println("kEY : "+entry.getKey() +" Value : "+entry.getValue());
		}
	}
	
	
	
	
	//Map key sorting descending order		
	public void sortBykeyDesc(Map<String,String> map){
		System.out.println("\nMap sorting in Descending");
			TreeMap<String,String> tmap = new TreeMap(new Comparator<String>() {
				public int compare(String arg0, String arg1) {
					return arg1.compareTo(arg0);}
			});
			tmap.putAll(map);
			for(Map.Entry entry : tmap.entrySet()){
				System.out.println("kEY : "+entry.getKey() +" Value : "+entry.getValue());
			}
	}
	public void sortByValue(Map<String,String> map){
		List ls = new ArrayList<>(map.entrySet());
		System.out.println(ls);
		Collections.sort(ls,new Comparator<Map.Entry<String, String>>(
				) {
					@Override
					public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
						// TODO Auto-generated method stub
						return o1.getValue().compareTo(o2.getValue());
					}
		});
		
		System.out.println(ls);
	}


}
