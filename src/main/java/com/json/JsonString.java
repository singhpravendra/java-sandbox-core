/**
 * 
 */
package com.json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

/**
 * @author pravendra.singh
 *
 */
public class JsonString {
	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		JsonParser jp = new JsonParser();
		Object object = jp.parse(new FileReader("test.json"));
		JsonObject jso = (JsonObject) object;
		System.out.println(((JsonObject) object).get("financial_info"));
		System.out.println(((JsonObject) ((JsonObject) object).get("financials")).get("cash"));
		/*System.out.println(((JsonObject) ((JsonObject) ((JsonObject) object).get("Info")).get("fields")).get("applicantid"));
		*/
	}

}
