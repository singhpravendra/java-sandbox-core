/**
 * 
 */
package com.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author pravendra.singh
 *
 */
/**
 * Iterable
 * Collection
 * List
 * Queue
 * Set
*/

public class CollectionsTest {

//Iterable Interface
	private void arrayList(){
		ArrayList arrList = new ArrayList();
		arrList.add(1);
		arrList.add("1");
		arrList.add("1");
		arrList.add("2");
		arrList.add('3');
		arrList.add(4.4);
		arrList.add(5);
		arrList.add("6");
		System.out.println("Frequency : "+Collections.frequency(arrList, "1"));
		Iterator itr ;
		itr = arrList.iterator();
		//arrList.add("10"); //java.util.ConcurrentModificationException
		while (itr.hasNext()){
			System.out.println(itr.next());
		};
			
	}
	public static void main(String[] args) {
		
		CollectionsTest test = new CollectionsTest();
		test.arrayList();

	}

}
