package com.demo.transfersvc;

import java.io.IOException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.map.ObjectMapper;
 
@Provider
public class RestExceptionMapper implements ExceptionMapper<RestGenException> {

	private static String ModuleName = "RestExceptionMapper";
	@Override
	public Response toResponse(RestGenException ex) {
		ObjectMapper mapper = new ObjectMapper();
		RestErrorResponse response = new RestErrorResponse(ex);
		//LogM.log(ModuleName, LogMessage.ERROR, response.toString());

		String jsonResponse = "";
		try {
			jsonResponse = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
		} catch (IOException e) {
			//LogM.log(ModuleName, LogMessage.ERROR, "Got IOException while creating JSON Error Response");
			
			//LogM.log(ModuleName,e.getMessage(),e);
		}
		//LogM.log(ModuleName, LogMessage.ERROR, jsonResponse);
		return Response.status(ex.getError().getStatus()).entity(jsonResponse).build();
	}
 
}