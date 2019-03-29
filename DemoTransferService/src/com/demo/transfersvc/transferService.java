package com.demo.transfersvc;


import java.io.IOException;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

	
@Path("/v1")
public class transferService {

	public static final int HTTP_CREATED = 201;

		private static Validator validator;
		public transferService(){

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			validator = factory.getValidator();

		}

		@POST
		@Path("/payments")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response process(String jsonRequest) throws Exception {
			createPaymentRq request = null;
			String jsonResponse = null;
			CreatePaymentService service = null;
			CreatePaymentsRs response = null;
			
			try {
				ObjectMapper mapper = new ObjectMapper();
				mapper.configure(Feature.AUTO_CLOSE_SOURCE, true);
				
				
				
				response = new CreatePaymentsRs();
				
				System.out.println("Received request : " + jsonRequest);
				// Convert JSON Rq String to Object
				request = mapper.readValue(jsonRequest, createPaymentRq.class);
				validateRequest(request, jsonRequest);
				
				service = new CreatePaymentService();
				
				response = service.createPayment(request, jsonRequest);
				jsonResponse = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
				

			} catch (JsonParseException | JsonGenerationException | JsonMappingException jpe) {
				jpe.printStackTrace();
				String msg = jpe.getMessage();
				if (msg.contains("Unexpected character ")) {
					System.out.println("Unexpected character " + jpe);
					msg = msg.substring(msg.indexOf(":") + 2, msg.indexOf("\n"));
				} else{
					msg = msg.substring(0, msg.indexOf("\n"));
				}
				System.out.println(msg);
				//throw new Exception();
				throw new RestGenException(com.demo.transfersvc.Constants.Error.JSON_PARSING.getCode(), com.demo.transfersvc.Constants.Error.JSON_PARSING.getDescription(),
						Constants.HTTP_BAD_REQUEST, msg);
			} catch (JsonProcessingException e) {
				

					throw new Exception();
			} catch (IOException e) {
				
				
			}
			catch (Exception e) {
				
				throw new Exception("Exception while validating service");
			}
			return Response.status(HTTP_CREATED).entity(jsonResponse).build();
		}

		private <T> void validateRequest(T request, String jsonRequest) throws Exception {
			Set<ConstraintViolation<T>> constraintViolations = validator.validate(request);
			if (constraintViolations.size() > 0) {
				
				throw new Exception();
			}		
		}


	}


