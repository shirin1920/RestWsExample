package com.demo.transfersvc;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "msgId",
    "creationDtTime",
    "customerId",
    "statusCode",
    "payments"
})
public class CreatePaymentsRs {

    @JsonProperty("msgId")
    private String msgId;
    @JsonProperty("creationDtTime")
    private String creationDtTime;
    @JsonProperty("customerId")
    private String customerId;
    @JsonProperty("statusCode")
    private String statusCode;
    @JsonProperty("payments")
    private Payment payments;
    
    @JsonIgnore
    private Long msgDBId;
    
    @JsonProperty("msgId")
    public String getMsgId() {
        return msgId;
    }

    @JsonProperty("msgId")
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    @JsonProperty("creationDtTime")
    public String getCreationDtTime() {
        return creationDtTime;
    }

    @JsonProperty("creationDtTime")
    public void setCreationDtTime(String creationDtTime) {
        this.creationDtTime = creationDtTime;
    }

     @JsonProperty("payments")
    public Payment getPayments() {
        return payments;
    }

    @JsonProperty("payments")
    public void setPayments(Payment payments) {
        this.payments = payments;
    }
    @JsonProperty("statusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }


	@Override
	public String toString() {
		return "CreatePaymentResponse [msgId=" + msgId + ", creationDtTime="	+ creationDtTime + ", customerId=" + customerId + ", statusCode=" + statusCode + ",payments=" + payments + "]";
	}
}
