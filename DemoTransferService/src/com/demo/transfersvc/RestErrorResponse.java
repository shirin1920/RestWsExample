package com.demo.transfersvc;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({ "error" })
public class RestErrorResponse {

	@JsonProperty("error")
	private Error error;

	public RestErrorResponse() {
	}

	public RestErrorResponse(Exception e) {
		this.error = new Error();
		this.error
				.setCode(String.valueOf(Constants.Error.UNKNOWN_ERROR.getCode()));
		this.error.setMessage(Constants.Error.UNKNOWN_ERROR.getDescription());
	}

	public RestErrorResponse(String errorCode, String description) {
		error = new Error();
		error.setCode(errorCode);
		error.setMessage(description);
	}

	public RestErrorResponse(RestGenException ex) {
		this.error=ex.getError();		
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "RestErrorResponse [error= " + error + " ]";
	}
}
