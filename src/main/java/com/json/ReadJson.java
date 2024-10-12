/**
 * 
 */
package com.json;

/**
 * @author pravendra.singh
 *
 */
import java.io.FileReader;
import java.util.Iterator;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;

import com.google.gson.JsonParser;

public class ReadJson {

	public static void main(String[] args) {
		JsonParser jp = new JsonParser();
		try {

			Object object = jp.parse(new FileReader("test.json"));
			JsonObject jso = (JsonObject) object;
			String wfpaction = "";
			JsonObject financialObj = (JsonObject) jso.get("financial_info");
			System.out.println(financialObj);
			JsonArray applArr = financialObj.getAsJsonArray("financials");
			
			Iterator financialItr = applArr.iterator(); 
			
			while (financialItr.hasNext()) 
			{ 
				//System.out.println("Check :"+itr2.next());
				Object key= financialItr.next();
				System.out.println("Key :"+key);
				JsonObject cashFlowobj = (JsonObject) key;
				System.out.println("cashFlowJobj :"+cashFlowobj);
				JsonObject cashFlowJsonobj = (JsonObject) cashFlowobj.get("cash_flow");
				
				System.out.println("cashFlowArr :"+cashFlowJsonobj);
				JsonArray transaction_summaryArr = cashFlowJsonobj.getAsJsonArray("transaction_summary");
				System.out.println("transaction_summaryArr : "+transaction_summaryArr);
				Iterator transaction = transaction_summaryArr.iterator(); 
				while(transaction.hasNext()){
					Object transactionkey= transaction.next();
					System.out.println("Key :"+transactionkey);
					JsonObject transactionkeyJsonobj = (JsonObject) (JsonObject) transactionkey;
					System.out.println("cashFlowJobj :"+transactionkeyJsonobj);
					String year = transactionkeyJsonobj.get("year").getAsString();        
					String month = transactionkeyJsonobj.get("year").getAsString();        
					String credit_transaction_count = transactionkeyJsonobj.get("credit_transaction_count").getAsString();        
					String total_credt_transaction_amount = transactionkeyJsonobj.get("total_credt_transaction_amount").getAsString();        
					String debit_transaction_count = transactionkeyJsonobj.get("debit_transaction_count").getAsString();        
					String total_debit_transaction_amount = transactionkeyJsonobj.get("total_debit_transaction_amount").getAsString();        
					String inward_chq_bounce_count = transactionkeyJsonobj.get("inward_chq_bounce_count").getAsString();        
					String outward_chq_bounce_count = transactionkeyJsonobj.get("outward_chq_bounce_count").getAsString();        
					String min_eod_balance = transactionkeyJsonobj.get("min_eod_balance").getAsString();        
					String max_eod_balance = transactionkeyJsonobj.get("max_eod_balance").getAsString();        
					String avg_eod_balance = transactionkeyJsonobj.get("avg_eod_balance").getAsString();        
					System.out.println("year: " + year);
					System.out.println("month: " + month);
					System.out.println("credit_transaction_count" + credit_transaction_count);
					System.out.println("total_credt_transaction_amount: " + total_credt_transaction_amount);
					System.out.println("debit_transaction_count: " + debit_transaction_count);
					System.out.println("total_debit_transaction_amount: " + total_debit_transaction_amount);
					System.out.println("inward_chq_bounce_count: " + inward_chq_bounce_count);
					System.out.println("outward_chq_bounce_count: " + outward_chq_bounce_count);
					
				}
			} 
			/*System.out.println(applArr);
			System.out.println();
			if (applArr != null) {
				for (int i = 0; i < applArr.size(); i++) {
					JsonObject tabObj = (JsonObject) applArr.get(i);
					System.out.println(tabObj);
					System.out.println();

					//JsonArray tabArr = tabObj.getAsJsonArray("cash_flow");
					JsonObject tabArr = (JsonObject) tabObj.get("cash_flow");
					System.out.println("tabArr :"+(i+1)+" "+tabArr);
					System.out.println();
					JsonArray transArr = tabArr.getAsJsonArray("transaction_summary");
					System.out.println(transArr);
					if (tabArr != null) {
						for (int j = 0; j < tabArr.size(); j++) {
							JsonObject subTabObj = (JsonObject) tabArr.get(i);
							System.out.println("subTabObj :"+subTabObj);
							JsonArray subTabArr = subTabObj
									.getAsJsonArray("transaction_summary");
							System.out.println(subTabArr);

							if (subTabArr != null) {
								for (int k = 0; k < subTabArr.size(); k++) {
									JsonObject wfpact = (JsonObject) subTabArr
											.get(i);

									wfpaction = ((JsonObject) (((JsonObject) wfpact)
											.get("fields"))).get("wfpaction")
											.getAsString();
									System.out.println(wfpaction);

								}
							}
						}
					}
				}
			}*/

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}