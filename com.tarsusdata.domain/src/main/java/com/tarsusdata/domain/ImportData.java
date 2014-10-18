package com.tarsusdata.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;
 
@Document(collection = "crimes")
public class ImportData extends BaseDomainObject {
	public String getCrimeID() {
		return crimeID;
	}
	public void setCrimeID(String crimeID) {
		this.crimeID = crimeID;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getReportedBy() {
		return reportedBy;
	}
	public void setReportedBy(String reportedBy) {
		this.reportedBy = reportedBy;
	}
	public String getFallsWithin() {
		return fallsWithin;
	}
	public void setFallsWithin(String fallsWithin) {
		this.fallsWithin = fallsWithin;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLsoacode() {
		return lsoacode;
	}
	public void setLsoacode(String lsoacode) {
		this.lsoacode = lsoacode;
	}
	public String getLsoaname() {
		return lsoaname;
	}
	public void setLsoaname(String lsoaname) {
		this.lsoaname = lsoaname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOutcomeCategory() {
		return outcomeCategory;
	}
	public void setOutcomeCategory(String outcomeCategory) {
		this.outcomeCategory = outcomeCategory;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	@Indexed(unique = true)
	private String crimeID;
	private String month;
	private String reportedBy;
	private String fallsWithin;
	private float longitude;
	private float latitude;
	private String location;
	private String lsoacode;
	private String lsoaname;
	private String type;
	private String outcomeCategory;
	private String context;
	public static ImportData convert(String[] stringArr) {
		ImportData importData = new ImportData();
		importData.setCrimeID(stringArr[0]);
		importData.setMonth(stringArr[1]);
		importData.setReportedBy(stringArr[2]);
		importData.setFallsWithin(stringArr[3]);
		if (!stringArr[4].isEmpty()) {
			importData.setLongitude(Float.valueOf(stringArr[4]));
		}
		if (!stringArr[5].isEmpty()) {
			importData.setLatitude(Float.valueOf(stringArr[5]));
		}
		importData.setLocation(stringArr[6]);
		importData.setLsoacode(stringArr[7]);
		importData.setLsoaname(stringArr[8]);
		importData.setType(stringArr[9]);
		importData.setOutcomeCategory(stringArr[10]);
		importData.setContext(stringArr[11]);
		return importData;
	}
}