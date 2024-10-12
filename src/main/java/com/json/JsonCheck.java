/**
 * 
 */
package com.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;
/**
 * @author pravendra.singh
 *
 */
public class JsonCheck {

	public static void main(String[] args) {
	
		String JsonObj="{\"customerDel\":\""
						+"9212102509" 
						+"\",\"transId\":\""
						+"[Res,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]"
						+"\",\"message\":\""
						+"Success\"}";
		//JsonObject jObj = new JsonObject();
        JsonObject jObjRes = new JsonObject();
        JsonParser parser = new JsonParser();
        Object obj = parser.parse(JsonObj);
//        /JsonArray jArray= (JsonArray)obj;
      System.out.println(((JsonObject) obj).get("customerDel"));
      System.out.println((JsonArray)((JsonObject) obj).get("transId"));
   
        
        
	}

}
