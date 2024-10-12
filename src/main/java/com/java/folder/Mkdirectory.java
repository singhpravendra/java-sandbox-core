/**
 * 
 */
package com.java.folder;

import java.io.File;

/**
 * @author pravendra.singh
 *
 */
public class Mkdirectory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File fl = new File("folder");
		if(!fl.exists()){
			if(fl.mkdir()){
				System.out.println("Folder created");
			}
		else{
			System.out.println("Unable to create the directory");
		}
		}
		else{
			System.out.println("Already exist");
		}

	}

}
