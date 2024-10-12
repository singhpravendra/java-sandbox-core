/**
 * 
 */
package com.uniqueimage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author pravendra.singh
 *
 */
public class UniqueImage {
	
	public static class Images{
		private String filename;
		private int width;
		private int height;
		
		private Images(String filename, int width, int height) {
			super();
			this.filename = filename;
			this.width = width;
			this.height = height;
		}
		
		public boolean equals(Object obj){
			
			Images o = (Images)obj;
			if(filename == null ||o.filename==null){
				return false;
			}
			String[] comp = filename.split("\\.");
			String[] ocomp = o.filename.split("\\.");
			
			return comp[0].equals(ocomp[0])&&width*height==o.width*o.height;
			
		}

		@Override
		public int hashCode() {
			String[] comp = filename.split("\\.");
			return comp[0].hashCode();
		}

		@Override
		public String toString() {
			return "Images : [filename=" + filename + ", size =" + width*height + "]";
		}
		
		
	}
	public static void printImage(Set<Images> image){
		for(Images img : image){
			System.out.println(img);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Images[] img = {new Images("abc.gif",40,60),
				new Images("abcd.gif",40,60),
				new Images("abc.htm",40,60),
				new Images("aaa.html",50,10),
				new Images("acvd",40,10),
				new Images("abc.sss",100,240)};
		Set<Images>set = new HashSet<Images>(Arrays.asList(img));
		UniqueImage.printImage(set);
	}

}
