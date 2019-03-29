package com.demo.transfersvc;

	import java.util.ArrayList;
	import java.util.List;

	import javax.validation.Valid;
	import javax.validation.constraints.Pattern;
	import javax.validation.constraints.Size;

	import com.fasterxml.jackson.annotation.JsonIgnore;
	import com.fasterxml.jackson.annotation.JsonInclude;
	import com.fasterxml.jackson.annotation.JsonProperty;
	import com.fasterxml.jackson.annotation.JsonPropertyOrder;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	    "msgId",
	    "creationDtTime",
	    "customerId",
	    "systemRefId",
	    "apprv",
	    "payments"
	})
public class createPaymentRq {
	
		
		@Size(max = 35)
		@JsonProperty("msgId")
	    private String msgId;
		@Pattern(regexp = "(^((\\d{4})-(\\d{2})-(\\d{2})T(\\d{2})\\:(\\d{2})\\:(\\d{2}))$)*", message = "Invalid format")
		@JsonProperty("creationDtTime")
	    private String creationDtTime;
	    
	    @Size(max = 12)
	    @JsonProperty("customerId")
	    private String customerId;
	    @Size(max = 35)
	    @JsonProperty("systemRefId")
	    private String systemRefId;
	  
	    @Valid
	    @JsonProperty("payments")
	    private List<Payment> payments = new ArrayList<Payment>();

	    @JsonIgnore
	    private Long msgDBId;
	    @JsonIgnore
	    private String messageClassType;
	    @JsonIgnore
	    private String msgFamily;
	    @JsonIgnore
	    private String msgSegr;
	    @JsonIgnore
	    private String transactionType;
	    @JsonIgnore
	    private String balanceUpdated;
	    @JsonIgnore
	    private String status;
	    @JsonIgnore
	    private String reasonCode;
	    @JsonIgnore
	    private String messageNo;
	    
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

	    @JsonProperty("customerId")
	    public String getCustomerId() {
	        return customerId;
	    }

	    @JsonProperty("customerId")
	    public void setCustomerId(String customerId) {
	        this.customerId = customerId;
	    }

	    @JsonProperty("systemRefId")
	    public String getSystemRefId() {
	        return systemRefId;
	    }

	    @JsonProperty("systemRefId")
	    public void setSystemRefId(String systemRefId) {
	        this.systemRefId = systemRefId;
	    }


	    @JsonProperty("payments")
	    public List<Payment> getPayments() {
	        return payments;
	    }

	    @JsonProperty("payments")
	    public void setPayments(List<Payment> payments) {
	        this.payments = payments;
	    }
	    
	    public String getMessageClassType() {
			return messageClassType;
		}

		public void setMessageClassType(String messageClassType) {
			this.messageClassType = messageClassType;
		}

		public String getMsgFamily() {
			return msgFamily;
		}

		public void setMsgFamily(String msgFamily) {
			this.msgFamily = msgFamily;
		}

		public String getMsgSegr() {
			return msgSegr;
		}

		public void setMsgSegr(String msgSegr) {
			this.msgSegr = msgSegr;
		}

		public String getTransactionType() {
			return transactionType;
		}

		public void setTransactionType(String transactionType) {
			this.transactionType = transactionType;
		}

		public String getBalanceUpdated() {
			return balanceUpdated;
		}

		public void setBalanceUpdated(String balanceUpdated) {
			this.balanceUpdated = balanceUpdated;
		}

		public Long getMsgDBId() {
			return msgDBId;
		}

		public void setMsgDBId(Long msgDBId) {
			this.msgDBId = msgDBId;
		}
		
		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getReasonCode() {
			return reasonCode;
		}

		public void setReasonCode(String reasonCode) {
			this.reasonCode = reasonCode;
		}
		
		public String getMessageNo() {
			return messageNo;
		}

		public void setMessageNo(String messageNo) {
			this.messageNo = messageNo;
		}

		@Override
		public String toString() {
			return "CreatePaymentRequest [msgId=" + msgId + ", creationDtTime="	+ creationDtTime + ", customerId=" + customerId + ", systemRefId=" + systemRefId + ",payments=" + payments + ", messageClassType=" + messageClassType + ", msgFamily=" + msgFamily + ", msgSegr=" + msgSegr + ", transactionType=" + transactionType + ", balanceUpdated=" + balanceUpdated + " msgDBId=" + msgDBId +"]";
		}
	}


