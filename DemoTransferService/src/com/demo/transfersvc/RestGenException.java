package com.demo.transfersvc;

public class RestGenException extends Exception {
	
	private RestErrorResponse restError;
	private Error error;
	//private static LogManager LogM = LogManager.getLogManagerObject();
	
	public RestGenException(RestErrorResponse restError) {
		try {
			//LogM.log("RestGenException", LogMessage.ERROR, "In RestGenException : " + restError.toString());
			error = new Error();
			this.restError = new RestErrorResponse();
			if (restError.getError().getCode() != null)
				error.setCode(restError.getError().getCode());
			if (restError.getError().getDescription() != null)
				error.setDescription(restError.getError().getDescription());
			if (restError.getError().getMessage() != null)
				error.setMessage(restError.getError().getMessage());
			error.setStatus(restError.getError().getStatus());
			//LogM.log("RestGenException", LogMessage.ERROR, "In Error : " + error.toString());
			this.restError.setError(error);
		} catch (Exception e) {
			//LogM.log("RestGenException", LogMessage.ERROR, "In RestGenException : " + e.getMessage());
		}
	}
	
	public RestGenException(int code, String description, int status, String message ) {
		error=new Error();
		this.restError=new RestErrorResponse();
		error.setCode(String.valueOf(code));
		error.setMessage(description);
		error.setDescription(message);
		error.setStatus(status);
		this.restError.setError(error);
	}
	
	public RestGenException(int code, String description, String message ,int status) {
		error = new Error();
		this.restError=new RestErrorResponse();
		error.setCode(String.valueOf(code));
		error.setMessage(description);
		error.setDescription(message);
		error.setStatus(status);
		this.restError.setError(error);
	}
	
	public RestGenException(int code, String description, int status) {
		error = new Error();
		this.restError=new RestErrorResponse();
		error.setCode(String.valueOf(code));
		error.setMessage(description);
		error.setStatus(status);
		this.restError.setError(error);
	}
	
	public RestGenException(int code, String description, String nativeCode,String nativeMessage) {
		error = new Error();
		this.restError=new RestErrorResponse();
		//NativeError nerror=new NativeError();
		
		error.setCode(String.valueOf(code));
		error.setMessage(description);
		error.setCode(nativeCode);
		error.setMessage(nativeMessage);
		//error.setNativeError(nerror);
		
		this.restError.setError(error);
	}

	public RestErrorResponse getRestError() {
		return restError;
	}

	public void setRestError(RestErrorResponse restError) {
		this.restError = restError;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}	
}
