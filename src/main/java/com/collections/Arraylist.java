/**
 * 
 */
package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;


/**
 * @author pravendra.singh
 *
 */
public class Arraylist {

	    public static void main(String[] args) throws Exception {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        numbers.add(1);
	        System.out.println(getCapacity(numbers));
	    }

	    static int getCapacity(List al) throws Exception {
	        Field field = ArrayList.class.getDeclaredField("elementData");
	        field.setAccessible(true);
	        return ((Object[]) field.get(al)).length;
	    }
}