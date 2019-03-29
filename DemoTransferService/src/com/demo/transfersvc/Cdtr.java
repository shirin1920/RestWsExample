package com.demo.transfersvc;


import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "acct",
    "agt",
    "nm",
    "adrLine",
    "ctry",
    "email"
})
public class Cdtr {


	@Size(max = 35)
    @JsonProperty("acct")
    private String acct;
    @JsonProperty("agt")
    private String agt;
  
    @Size(max = 70)
    @JsonProperty("nm")
    private String nm;
    @Size(max = 2)
    @JsonProperty("adrLine")
    private List<String> adrLine = new  ArrayList<String>();

    @Size(max = 2)
    @JsonProperty("ctry")
    private String ctry;
    @Size(max = 128)
    @JsonProperty("email")
    private String email;
    @JsonIgnore
    private String line1;
    @JsonIgnore
    private String line2;
    @JsonIgnore
    private String line3;
    @JsonIgnore
    private String line4;
    
    @JsonProperty("acct")
    public String getAcct() {
        return acct;
    }

    @JsonProperty("acct")
    public void setAcct(String acct) {
        this.acct = acct;
    }

    @JsonProperty("agt")
    public String getAgt() {
        return agt;
    }

    @JsonProperty("agt")
    public void setAgt(String agt) {
        this.agt = agt;
    }

    @JsonProperty("nm")
    public String getNm() {
        return nm;
    }

    @JsonProperty("nm")
    public void setNm(String nm) {
        this.nm = nm;
    }
    
    public List<String> getAdrLine() {
		return adrLine;
	}

	public void setAdrLine(List<String> adrLine) {
		this.adrLine = adrLine;
	}

	@JsonProperty("ctry")
    public String getCtry() {
        return ctry;
    }

    @JsonProperty("ctry")
    public void setCtry(String ctry) {
        this.ctry = ctry;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public String getLine4() {
		return line4;
	}

	public void setLine4(String line4) {
		this.line4 = line4;
	}
    
}
