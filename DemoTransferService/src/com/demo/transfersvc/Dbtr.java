package com.demo.transfersvc;


import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "acct",
    "agt",
    "nm",
    "ctry"
})
public class Dbtr {


	@Size(max = 35)
    @JsonProperty("acct")
    private String acct;

    @JsonProperty("agt")
    private String agt;

	@Size(max = 70)
    @JsonProperty("nm")
    private String nm;

	@Size(max = 2)
    @JsonProperty("ctry")
    private String ctry;

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

    @JsonProperty("ctry")
    public String getCtry() {
        return ctry;
    }

    @JsonProperty("ctry")
    public void setCtry(String ctry) {
        this.ctry = ctry;
    }
}
