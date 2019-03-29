package com.demo.transfersvc;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reqdExctnDt",
    "instdAmt",
    "instrPrty",
    "svcLvl",
    "chrgBr",
    "endToEndId",
    "dbtr",
    "cdtr",
    "rmtInf",
    "addtlRmtInf"
})
public class Payment {

	@Pattern(regexp = "^((?:[1-9]\\d{3}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[1-9]\\d(?:0[48]|[2468][048]|[13579][26])|(?:[2468][048]|[13579][26])00)-02-29))?$", message = "Invalid date")
	@JsonProperty("reqdExctnDt")
    private String reqdExctnDt;
  
    @Pattern(regexp = "^[0-9]\\d*(\\.\\d+)?$", message = "Invalid format")
    @JsonProperty("instdAmt")
    private String instdAmt;
 
    @JsonProperty("ccy")
    private String ccy;
    @Size(max = 4)
    @JsonProperty("instrPrty")
    private String instrPrty;
 
    @Size(max = 4)
    @JsonProperty("svcLvl")
    private String svcLvl;
    @Size(max = 4)
    @JsonProperty("chrgBr")
    private String chrgBr;
   
    @Size(max = 31)
    @JsonProperty("endToEndId")
    private String endToEndId;
    @NotNull
    @Valid
    @JsonProperty("dbtr")
    private Dbtr dbtr;
    @NotNull
    @Valid
    @JsonProperty("cdtr")
    private Cdtr cdtr;
  
    @JsonIgnore
    private String chrgBrEdited;
    
    @JsonProperty("reqdExctnDt")
    public String getReqdExctnDt() {
        return reqdExctnDt;
    }

    @JsonProperty("reqdExctnDt")
    public void setReqdExctnDt(String reqdExctnDt) {
        this.reqdExctnDt = reqdExctnDt;
    }

    @JsonProperty("instdAmt")
    public String getInstdAmt() {
        return instdAmt;
    }

    @JsonProperty("instdAmt")
    public void setInstdAmt(String instdAmt) {
        this.instdAmt = instdAmt;
    }

    @JsonProperty("ccy")
    public String getCcy() {
		return ccy;
	}

    @JsonProperty("ccy")
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	@JsonProperty("instrPrty")
    public String getInstrPrty() {
        return instrPrty;
    }

    @JsonProperty("instrPrty")
    public void setInstrPrty(String instrPrty) {
        this.instrPrty = instrPrty;
    }

    @JsonProperty("svcLvl")
    public String getSvsLvl() {
        return svcLvl;
    }

    @JsonProperty("svcLvl")
    public void setSvcLvl(String svcLvl) {
        this.svcLvl = svcLvl;
    }

    @JsonProperty("chrgBr")
    public String getChrgBr() {
        return chrgBr;
    }

    @JsonProperty("chrgBr")
    public void setChrgBr(String chrgBr) {
        this.chrgBr = chrgBr;
    }

    @JsonProperty("endToEndId")
    public String getEndToEndId() {
        return endToEndId;
    }

    @JsonProperty("endToEndId")
    public void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId;
    }

    @JsonProperty("dbtr")
    public Dbtr getDbtr() {
        return dbtr;
    }

    @JsonProperty("dbtr")
    public void setDbtr(Dbtr dbtr) {
        this.dbtr = dbtr;
    }

    @JsonProperty("cdtr")
    public Cdtr getCdtr() {
        return cdtr;
    }

    @JsonProperty("cdtr")
    public void setCdtr(Cdtr cdtr) {
        this.cdtr = cdtr;
    }

   
	public String getChrgBrEdited() {
		return chrgBrEdited;
	}

	public void setChrgBrEdited(String chrgBrEdited) {
		this.chrgBrEdited = chrgBrEdited;
	}

	public String getSvcLvl() {
		return svcLvl;
	}

	@Override
	public String toString() {
		return "Payment [reqdExctnDt=" + reqdExctnDt + ", instdAmt=" + instdAmt + ", instrPrty=" + instrPrty + ", svcLvl=" + svcLvl + ", chrgBr=" + chrgBr + ", endToEndId=" + endToEndId + ", dbtr=" + dbtr + ", cdtr=" + cdtr +  "]";
	}
}
