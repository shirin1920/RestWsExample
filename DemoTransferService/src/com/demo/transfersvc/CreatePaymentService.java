package com.demo.transfersvc;

public class CreatePaymentService {
	
	public CreatePaymentsRs createPayment(createPaymentRq request, String jsonRequest) {
		System.out.println("In createPayment");
		CreatePaymentsRs response = null;
		response = new CreatePaymentsRs();
		response.setCreationDtTime(request.getCreationDtTime());
		response.setMsgId(request.getMsgId());
		response.setStatusCode("Payment successful");
		System.out.println("Response :" + response);
		return response;
				
				
	}

}
