package com.tarsusdata.domain;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reports")
public class Report extends BaseDomainObject {
	public Report(){}
	
	public Report(String rptN, String catN) {
		this.catN = catN;
		this.rptN = rptN;
	}
	
	@Indexed(unique = true)
	private String rptN;	
	public String getRptN() {
		return rptN;
	}

	public void setRptN(String rptN) {
		this.rptN = rptN;
	}

	public String getCatN() {
		return catN;
	}

	public void setCatN(String catN) {
		this.catN = catN;
	}

	public String getsCatN() {
		return sCatN;
	}

	public void setsCatN(String sCatN) {
		this.sCatN = sCatN;
	}

	public String getDcrpt() {
		return dcrpt;
	}

	public void setDcrpt(String dcrpt) {
		this.dcrpt = dcrpt;
	}

	public String getDesDoc() {
		return desDoc;
	}

	public void setDesDoc(String desDoc) {
		this.desDoc = desDoc;
	}

	public String getProps() {
		return props;
	}

	public void setProps(String props) {
		this.props = props;
	}

	private String catN;
	private String sCatN;	
	private String dcrpt;
	private String desDoc;
	private String props;

}