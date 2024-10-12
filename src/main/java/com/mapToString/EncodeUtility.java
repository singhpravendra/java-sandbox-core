package com.mapToString;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class EncodeUtility {
	private static final Logger LOGGER = Logger.getLogger(EncodeUtility.class);

	private EncodeUtility() {

	}

	public static String mapToString(Map<String, String> map) {
		StringBuilder stringBuilder = new StringBuilder();

		for (String key : map.keySet()) {
			if (stringBuilder.length() > 0) {
				stringBuilder.append("&");
			}
			String value = map.get(key);
			try {

				stringBuilder.append(key != null ? URLEncoder.encode(key,
						"UTF-8") : "");
				stringBuilder.append("=");
				stringBuilder.append(value != null ? URLEncoder.encode(value,
						"UTF-8") : "");

			} catch (Exception e) {
				LOGGER.error("Error in ", e);

			}
		}

		return stringBuilder.toString();
	}
public static void main(String[] args) {
	Map<String,String> mp = new HashMap();
	mp.put("1","One");
	mp.put("2","Two");
	mp.put("3","Three");
	mp.put("4","Four");
	mp.put("5","Five");
	mp.put("6","Six");
	//System.out.println(mp.keySet());
	//System.out.println(mp.values());
	LOGGER.debug(mp.values());
	/*System.out.println(mapToString(mp));
	for (String key : mp.keySet()){
		System.out.println(mp.get(key));
	}*/
	
}

}
