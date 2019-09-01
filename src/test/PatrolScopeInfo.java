import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PatrolScopeInfo {

	private Integer patrolID;

	private String patrolName;

	private String telMobile;

	private String IMEI;

	private String cardID;

	private Double coordinateX;

	private Double coordinateY;

	private Date updateTime;

	private Integer patrolState;

	private String districtName;

	private String unitName;


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

	public String getTelMobile() {
		return telMobile;
	}

	public void setTelMobile(String telMobile) {
		this.telMobile = telMobile;
	}

	public String getIMEI() {
		return IMEI;
	}

	public void setIMEI(String IMEI) {
		this.IMEI = IMEI;
	}

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	public Double getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(Double coordinateX) {
		this.coordinateX = coordinateX;
	}

	public Double getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(Double coordinateY) {
		this.coordinateY = coordinateY;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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
}
