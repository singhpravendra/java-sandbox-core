/**
 * 
 */
package com.collections;
import java.util.ArrayList;
import java.util.List;
/**
 * @author pravendra.singh
 *
 */
public class Iterator {

	 public static void main(String a[]){
         
	        String removeElem = "Perl";
	        List<String> myList = new ArrayList<String>();
	        myList.add("Java");
	        myList.add("Unix");
	        myList.add("Oracle");
	        myList.add("C++");
	        myList.add("Perl");
	        System.out.println("Before remove:");
	        System.out.println(myList);
	        java.util.Iterator<String> itr = myList.iterator();
	        while(itr.hasNext()){
	            if(removeElem.equals(itr.next())){
	                itr.remove();
	            }
	        }
	        System.out.println("After remove:");
	        System.out.println(myList);
	    }
}
