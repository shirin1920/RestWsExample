package com.demo.transfersvc;

public class Constants {

	public static final int HTTP_INTERNAL_SERVER_ERROR = 500;
	public static final int HTTP_BAD_REQUEST = 400;
	public static final int HTTP_OK = 200;
	public static final int HTTP_CREATED = 201;
	public static final int HTTP_FORBIDDEN = 403;

	
	
	public static enum Error {
		JSON_PARSING(16251, "Error while parsing JSON object."), 
		JSON_MAPPER(16252, "Error while mapping object to JSON."), 
		GENERAL_UNKNOWN(16250, "Unknown error while parsing JSON object."), 
		
		API_KEY_NOT_FOUND(16253,"Api key not found "),
		API_KEY_INVALID(16254,"Invalid API Key provided for the Institution "),
		AUTHORIZATION_HEADER_INCORRECT(16255,"Authorization header is incorrect "),
		AUTHORIZATION_HEADER_NOT_FOUND(16256,"Authorization header not found "),
		INSTITUTION_ID_NOT_IN_HEADER(16257,"InstitutionId not found in header "),
		INVALID_JSON_REQUEST(16258,"Invalid JSON request"),
		UNKNOWN_ERROR(16259,"General Exception");

		private final int code;
		private final String description;

		private Error(int code, String description) {
			this.code = code;
			this.description = description;
		}
		
		/*public static Error getAuthError(AuthenticationService.Status status) {
			switch (status) {
			case API_KEY_NOT_FOUND:
				return API_KEY_NOT_FOUND;
			case API_KEY_INVALID:
				return API_KEY_NOT_FOUND;
			case AUTHORIZATION_HEADER_INCORRECT:
				return AUTHORIZATION_HEADER_INCORRECT;
			case AUTHORIZATION_HEADER_NOT_FOUND:
				return AUTHORIZATION_HEADER_NOT_FOUND;
			case INSTITUTION_ID_NOT_IN_HEADER:
				return INSTITUTION_ID_NOT_IN_HEADER;
			default:
				return UNKNOWN_ERROR;
			}
			
		}*/
		
		public String getDescription() {
			return description;
		}

		public int getCode() {
			return code;
		}

		@Override
		public String toString() {
			return code + ": " + description;
		}
	}

}
