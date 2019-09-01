package cn.com.egova.bean;

import java.util.Date;

public class PatrolInfo {

	private Integer patrolID;
	private String patrolName;
	private String cardID;
	private Integer patrolTypeID;
	private double coordinateX;
	private double coordinateY;
	private Integer patrolState;
	private String districtName;
	private String unitName;
//	private Date updateTime;
	private String telMobile;
	private String imei;

	public Integer getPatrolID() {
		return patrolID;
	}

	public void setPatrolID(Integer patrolID) {
		this.patrolID = patrolID;
	}

	public String getPatrolName() {
		return patrolName;
	}

	public void setPatrolName(String patrolName) {
		this.patrolName = patrolName;
	}

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	public double getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(double coordinateX) {
		this.coordinateX = coordinateX;
	}

	public double getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(double coordinateY) {
		this.coordinateY = coordinateY;
	}

	public Integer getPatrolState() {
		return patrolState;
	}

	public void setPatrolState(Integer patrolState) {
		this.patrolState = patrolState;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}


	public String getTelMobile() {
		return telMobile;
	}

	public void setTelMobile(String telMobile) {
		this.telMobile = telMobile;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public Integer getPatrolTypeID() {
		return patrolTypeID;
	}

	public void setPatrolTypeID(Integer patrolTypeID) {
		this.patrolTypeID = patrolTypeID;
	}
}
