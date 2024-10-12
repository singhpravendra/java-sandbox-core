/**
 * 
 */
package com.json;

//Java program to read JSON from a file 

import java.io.FileReader; 
import java.io.IOException;
import java.util.Iterator; 
import java.util.List;
import java.util.Map; 

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JSONReadExample 
{ 
	public static void main(String[] args) throws Exception 
	{ 
		// parsing file "JSONExample.json" 
/*		JsonParser jp = new JsonParser();
		Object object = jp.parse(new FileReader("test2.json"));
		JsonObject jo = (JsonObject) object;
		System.out.println(jo);
*/
		 ObjectMapper mapper=new ObjectMapper();
		try {
		/*JsonParser jp = new JsonParser();
		*/
		Map<String,Map<String,List<Map<String,Map<String,?>>>>> map=mapper.readValue(new FileReader("test.json"), Map.class);
		List<Map<String,Map<String,?>>> cash_flow=map.get("financial_info").get("financials");
		for(Map<String,Map<String,?>> innerMap:cash_flow){
		Map<String,?> innnerSubMap=innerMap.get("cash_flow");
		System.out.println(innnerSubMap.get("account_info"));
		System.out.println(innnerSubMap.get("transaction_summary").getClass());
		}


		} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

	} 
} 
