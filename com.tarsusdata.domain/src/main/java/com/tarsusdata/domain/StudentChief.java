package com.tarsusdata.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "studentChief")
public class StudentChief extends BaseDomainObject {
	public int getUnitid() {
		return unitid;
	}

	public void setUnitid(int unitid) {
		this.unitid = unitid;
	}

	public String getInstnm() {
		return instnm;
	}

	public void setInstnm(String instnm) {
		this.instnm = instnm;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getFips() {
		return fips;
	}

	public void setFips(int fips) {
		this.fips = fips;
	}

	public int getObereg() {
		return obereg;
	}

	public void setObereg(int obereg) {
		this.obereg = obereg;
	}

	public String getChfnm() {
		return chfnm;
	}

	public void setChfnm(String chfnm) {
		this.chfnm = chfnm;
	}

	public String getChfitle() {
		return chfitle;
	}

	public void setChfitle(String chfitle) {
		this.chfitle = chfitle;
	}

	public String getGentele() {
		return gentele;
	}

	public void setGentele(String gentele) {
		this.gentele = gentele;
	}

	public String getFaxtele() {
		return faxtele;
	}

	public void setFaxtele(String faxtele) {
		this.faxtele = faxtele;
	}

	public int getEin() {
		return ein;
	}

	public void setEin(int ein) {
		this.ein = ein;
	}

	public int getOpeid() {
		return opeid;
	}

	public void setOpeid(int opeid) {
		this.opeid = opeid;
	}

	public int getOpeflag() {
		return opeflag;
	}

	public void setOpeflag(int opeflag) {
		this.opeflag = opeflag;
	}

	public String getWebaddr() {
		return webaddr;
	}

	public void setWebaddr(String webaddr) {
		this.webaddr = webaddr;
	}

	public String getAdminurl() {
		return adminurl;
	}

	public void setAdminurl(String adminurl) {
		this.adminurl = adminurl;
	}

	public String getFaidurl() {
		return faidurl;
	}

	public void setFaidurl(String faidurl) {
		this.faidurl = faidurl;
	}

	public String getApplurl() {
		return applurl;
	}

	public void setApplurl(String applurl) {
		this.applurl = applurl;
	}

	public String getNpricurl() {
		return npricurl;
	}

	public void setNpricurl(String npricurl) {
		this.npricurl = npricurl;
	}

	public int getSector() {
		return sector;
	}

	public void setSector(int sector) {
		this.sector = sector;
	}

	public int getIclevel() {
		return iclevel;
	}

	public void setIclevel(int iclevel) {
		this.iclevel = iclevel;
	}

	public int getControl() {
		return control;
	}

	public void setControl(int control) {
		this.control = control;
	}

	public int getHloffer() {
		return hloffer;
	}

	public void setHloffer(int hloffer) {
		this.hloffer = hloffer;
	}

	public int getUgoffer() {
		return ugoffer;
	}

	public void setUgoffer(int ugoffer) {
		this.ugoffer = ugoffer;
	}

	public int getGroffer() {
		return groffer;
	}

	public void setGroffer(int groffer) {
		this.groffer = groffer;
	}

	public int getHdegofr() {
		return hdegofr;
	}

	public void setHdegofr(int hdegofr) {
		this.hdegofr = hdegofr;
	}

	public int getDeggran() {
		return deggran;
	}

	public void setDeggran(int deggran) {
		this.deggran = deggran;
	}

	public int getHbcu() {
		return hbcu;
	}

	public void setHbcu(int hbcu) {
		this.hbcu = hbcu;
	}

	public int getHosiptal() {
		return hosiptal;
	}

	public void setHosiptal(int hosiptal) {
		this.hosiptal = hosiptal;
	}

	public int getMedical() {
		return medical;
	}

	public void setMedical(int medical) {
		this.medical = medical;
	}

	public int getTribal() {
		return tribal;
	}

	public void setTribal(int tribal) {
		this.tribal = tribal;
	}

	public int getLocale() {
		return locale;
	}

	public void setLocale(int locale) {
		this.locale = locale;
	}

	public int getOpenpub() {
		return openpub;
	}

	public void setOpenpub(int openpub) {
		this.openpub = openpub;
	}

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

	public int getNewid() {
		return newid;
	}

	public void setNewid(int newid) {
		this.newid = newid;
	}

	public int getDeathyr() {
		return deathyr;
	}

	public void setDeathyr(int deathyr) {
		this.deathyr = deathyr;
	}

	public int getClosedate() {
		return closedate;
	}

	public void setClosedate(int closedate) {
		this.closedate = closedate;
	}

	public int getCyative() {
		return cyative;
	}

	public void setCyative(int cyative) {
		this.cyative = cyative;
	}

	public int getPostsec() {
		return postsec;
	}

	public void setPostsec(int postsec) {
		this.postsec = postsec;
	}

	public int getPseflag() {
		return pseflag;
	}

	public void setPseflag(int pseflag) {
		this.pseflag = pseflag;
	}

	public int getPset4flg() {
		return pset4flg;
	}

	public void setPset4flg(int pset4flg) {
		this.pset4flg = pset4flg;
	}

	public int getRptmth() {
		return rptmth;
	}

	public void setRptmth(int rptmth) {
		this.rptmth = rptmth;
	}

	public String getArcol() {
		return arcol;
	}

	public void setArcol(String arcol) {
		this.arcol = arcol;
	}

	public int getInstcat() {
		return instcat;
	}

	public void setInstcat(int instcat) {
		this.instcat = instcat;
	}

	public int getCcbasic() {
		return ccbasic;
	}

	public void setCcbasic(int ccbasic) {
		this.ccbasic = ccbasic;
	}

	public int getCcipug() {
		return ccipug;
	}

	public void setCcipug(int ccipug) {
		this.ccipug = ccipug;
	}

	public int getCcipgrad() {
		return ccipgrad;
	}

	public void setCcipgrad(int ccipgrad) {
		this.ccipgrad = ccipgrad;
	}

	public int getCcugprof() {
		return ccugprof;
	}

	public void setCcugprof(int ccugprof) {
		this.ccugprof = ccugprof;
	}

	public int getCcenrprf() {
		return ccenrprf;
	}

	public void setCcenrprf(int ccenrprf) {
		this.ccenrprf = ccenrprf;
	}

	public int getCarnegie() {
		return carnegie;
	}

	public void setCarnegie(int carnegie) {
		this.carnegie = carnegie;
	}

	public int getLandrnt() {
		return landrnt;
	}

	public void setLandrnt(int landrnt) {
		this.landrnt = landrnt;
	}

	public int getInstsize() {
		return instsize;
	}

	public void setInstsize(int instsize) {
		this.instsize = instsize;
	}

	public int getCbsa() {
		return cbsa;
	}

	public void setCbsa(int cbsa) {
		this.cbsa = cbsa;
	}

	public int getCbsatype() {
		return cbsatype;
	}

	public void setCbsatype(int cbsatype) {
		this.cbsatype = cbsatype;
	}

	public int getCsa() {
		return csa;
	}

	public void setCsa(int csa) {
		this.csa = csa;
	}

	public int getNecta() {
		return necta;
	}

	public void setNecta(int necta) {
		this.necta = necta;
	}

	public int getF1systype() {
		return f1systype;
	}

	public void setF1systype(int f1systype) {
		this.f1systype = f1systype;
	}

	public String getF1sysname() {
		return f1sysname;
	}

	public void setF1sysname(String f1sysname) {
		this.f1sysname = f1sysname;
	}

	public int getF1syscod() {
		return f1syscod;
	}

	public void setF1syscod(int f1syscod) {
		this.f1syscod = f1syscod;
	}

	public int getCountycd() {
		return countycd;
	}

	public void setCountycd(int countycd) {
		this.countycd = countycd;
	}

	public String getCountynm() {
		return countynm;
	}

	public void setCountynm(String countynm) {
		this.countynm = countynm;
	}

	public int getCngdstcd() {
		return cngdstcd;
	}

	public void setCngdstcd(int cngdstcd) {
		this.cngdstcd = cngdstcd;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	private int unitid;
	private String instnm;
	private Address address;
	private int fips;
	private int obereg;
	private String chfnm;
	private String chfitle;
	private String gentele;
	private String faxtele;
	private int ein;
	private int opeid;	
	private int opeflag;
	private String webaddr;
	private String adminurl;
	private String faidurl;
	private String applurl;
	private String npricurl;
	private int sector;
	private int iclevel;
	private int control;
	private int hloffer;
	private int ugoffer;
	private int groffer;
	private int hdegofr;
	private int deggran;
	private int hbcu;
	private int hosiptal;
	private int medical;
	private int tribal;
	private int locale;
	private int openpub;
	private String act;
	private int newid;
	private int deathyr;
	private int closedate;
	private int cyative;
	private int postsec;
	private int pseflag;
	private int pset4flg;
	private int rptmth;
	private String arcol;
	private int instcat;
	private int ccbasic;
	private int ccipug;
	private int ccipgrad;
	private int ccugprof;
	private int ccenrprf;
	private int carnegie;
	private int landrnt;
	private int instsize;
	private int cbsa;
	private int cbsatype;
	private int csa;
	private int necta;
	private int f1systype;
	private String f1sysname;
	private int f1syscod;
	private int countycd;
	private String countynm;
	private int cngdstcd;
	private int longitude;
	private int latitude;
	
	public static class Address {
		String addr;
		String city;
		String stabbr;
		String zipcode;	
	
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getStabbr() {
			return stabbr;
		}
		public void setStabbr(String stabbr) {
			this.stabbr = stabbr;
		}
		public String getZipcode() {
			return zipcode;
		}
		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}
	}	
	
	public static StudentChief convert(String[] stringArr) {
		StudentChief sc = new StudentChief();
		int i=0;
		if (stringArr[i] != null) {
			sc.unitid = Integer.valueOf(stringArr[i++]).intValue();
		}

		sc.instnm = stringArr[i++];

		Address address = new Address();
		sc.address = address;
		address.setAddr(stringArr[i++]);
		address.setCity(stringArr[i++]);
		address.setStabbr(stringArr[i++]);
		address.setZipcode(stringArr[i++]);

		if (stringArr[i] != null) {
			sc.fips = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.obereg = Integer.valueOf(stringArr[i++]).intValue();
		}

		sc.chfnm = stringArr[i++];		
		sc.chfitle = stringArr[i++];
		sc.gentele = stringArr[i++];
		sc.faxtele = stringArr[i++];

		if (stringArr[i] != null) {
			sc.ein = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.opeid = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.opeflag = Integer.valueOf(stringArr[i++]).intValue();
		}

		sc.webaddr = stringArr[i++];
		sc.adminurl = stringArr[i++];
		sc.faidurl = stringArr[i++];
		sc.applurl = stringArr[i++];
		sc.npricurl = stringArr[i++];
		
		if (stringArr[i] != null) {
			sc.sector = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.iclevel = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.control = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.hloffer = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.ugoffer = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.groffer = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.hdegofr = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.deggran = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.hbcu = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.hosiptal = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.medical = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.tribal = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.locale = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.openpub = Integer.valueOf(stringArr[i++]).intValue();
		}

		sc.act = stringArr[i++];

		if (stringArr[i] != null) {
			sc.newid = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.deathyr = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.closedate = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.cyative = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.postsec = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.pseflag = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.pset4flg = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.rptmth = Integer.valueOf(stringArr[i++]).intValue();
		}

		sc.arcol = stringArr[i++];

		if (stringArr[i++] != null) {
			sc.instcat = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i++] != null) {
			sc.ccbasic = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.ccipug = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.ccipgrad = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.ccugprof = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.ccenrprf = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.carnegie = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.landrnt = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.instsize = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.cbsa = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.cbsatype =  Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.csa = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.necta = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.f1systype = Integer.valueOf(stringArr[i++]).intValue();
		}
		
		sc.f1sysname = stringArr[i++];
			
		if (stringArr[i++] != null) {
			sc.f1syscod = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.countycd = Integer.valueOf(stringArr[i++]).intValue();
		}

		sc.countynm = stringArr[i++];

		if (stringArr[i] != null) {
			sc.cngdstcd = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.longitude = Integer.valueOf(stringArr[i++]).intValue();
		}

		if (stringArr[i] != null) {
			sc.latitude = Integer.valueOf(stringArr[i++]).intValue();
		}
		
		return sc;
	}
}
