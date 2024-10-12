/**
 * 
 */
package com.characterClassTest;

/**
 * @author pravendra.singh
 *
 */
public class CharacterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char [] ch ={'a','b','c'};
		String str = "a@b@c@g";
		for (int i=0;i<str.length();i++){
			if(str.charAt(i)=='@'){
				continue;
			}
		}

	}

}
