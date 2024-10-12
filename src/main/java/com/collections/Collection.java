/**
 * 
 */
package com.collections;

import java.util.*;
public class Collection 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("Z"));
		
		//System.out.println(Collections.frequency(t, "A"));
		System.out.println(t);
		}
}