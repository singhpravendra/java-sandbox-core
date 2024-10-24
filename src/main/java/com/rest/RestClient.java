/**
 * 
 */
package com.rest;

/**
 * @author pravendra.singh
 *
 */

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
public class RestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MediaType mediatype = MediaType.APPLICATION_JSON_TYPE;
		MediaType mediatype1 = MediaType.MULTIPART_FORM_DATA_TYPE;

		ClientConfig clientconfig = new ClientConfig();
		Client client = ClientBuilder.newClient((Configuration) clientconfig);

		WebTarget webtarget = client.target("http://10.165.101.45/collections/rest/reposurrdetails/reposurrupdate");
		WebTarget resourcewebtarget = webtarget.path("");

		Invocation.Builder invocationbuilder = resourcewebtarget
		.request(mediatype);
		Response response = invocationbuilder.post(Entity.entity(
		"", mediatype1));

		FileDownLoadResponse fileDownLoadResponse = response.readEntity(FileDownLoadResponse.class);
		System.out.println(fileDownLoadResponse.getBinaryData());

	}

}
