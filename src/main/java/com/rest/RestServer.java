/**
 * 
 */
package com.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.media.multipart.FormDataParam;

/**
 * @author pravendra.singh
 *
 */
@Path("FileUploadService")
	public class RestServer{
		//private static Logger log = Logger.getLogger(DocumentUploadRest.class.getName());
		@POST
		@Consumes(MediaType.MULTIPART_FORM_DATA)
		@Produces(MediaType.TEXT_PLAIN)
		@Path("/postUploadImage")
		public Response postUploadImage(@FormDataParam("userId") String strUserId) {
			//log.debug("Entering " + this.getClass().getPackage() + "." + this.getClass().getName() + ".postUploadImage() with parameters[strUserId: " + strUserId + ", strDeviceId: " + strDeviceId + ", strfileName: " + strfileName + ", applicationId: " + strapplicationId + ", strapplicantId: " + strapplicantId + ", strdocumentType: " + strdocumentType +"]");
			return Response.status(200).entity(uploadImage(strUserId)).build();
		}
		
		protected String uploadImage(String strUserId){
			return "Success";
		}
	}
