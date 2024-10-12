/**
 *
 */
package com.base64;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.codec.binary.Base64;

/**
 * @author pravendra.singh
 *
 */
public class Base64Covertion {

	private void encode(){
		File originalFile = new File("sample.pdf");
        String encodedBase64 = null;
        try (FileInputStream fileInputStreamReader = new FileInputStream(originalFile);){
            //FileInputStream fileInputStreamReader = new FileInputStream(originalFile);
            byte[] bytes = new byte[(int)originalFile.length()];
            fileInputStreamReader.read(bytes);
            encodedBase64 = new String(Base64.encodeBase64(bytes));
            System.out.println("encodedBase64 :"+encodedBase64);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	private void decode(){
		File originalFile = new File("sample.pdf");
        String encodedBase64 = null;
        try( FileInputStream fileInputStreamReader = new FileInputStream(originalFile);) {
            byte[] bytes = new byte[(int)originalFile.length()];
            fileInputStreamReader.read(bytes);
            encodedBase64 = new String(Base64.encodeBase64(bytes));
            System.out.println("encodedBase64 :"+encodedBase64);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	public static void main(String[] args) {
		Base64Covertion bs64 = new Base64Covertion();
		bs64.encode();
		//bs64.decode();
	}

}
