package com.sathish.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="catalog")
public class CableInternetCatalog {

	@Id
	private String planName;

	private String downloadSpeed;

	private String uploadSpeed;

	private BigDecimal chargPerHr;

	
	public CableInternetCatalog() {
	}
	
	public CableInternetCatalog(String planName, String downloadSpeed, String uploadSpeed, BigDecimal chargPerHr, int port) {
		super();
		this.planName = planName;
		this.downloadSpeed = downloadSpeed;
		this.uploadSpeed = uploadSpeed;
		this.chargPerHr = chargPerHr;
	}
	

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getDownloadSpeed() {
		return downloadSpeed;
	}

	public void setDownloadSpeed(String downloadSpeed) {
		this.downloadSpeed = downloadSpeed;
	}

	public String getUploadSpeed() {
		return uploadSpeed;
	}

	public void setUploadSpeed(String uploadSpeed) {
		this.uploadSpeed = uploadSpeed;
	}

	public BigDecimal getChargPerHr() {
		return chargPerHr;
	}

	public void setChargPerHr(BigDecimal chargPerHr) {
		this.chargPerHr = chargPerHr;
	}



}
