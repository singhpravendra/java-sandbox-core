/**
 * 
 */
package com.customannotation;

import java.lang.annotation.*;

/**
 * @author pravendra.singh
 *
 */
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface CustomAnnotation {
	
	 String name(); 

}

public class MyAnnotation{
	@CustomAnnotation(name="Annotation")
	public void show(){
		System.out.println("Hello My Annotation");
	}

}

