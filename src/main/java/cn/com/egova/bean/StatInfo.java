package cn.com.egova.bean;

import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Table(name = "to_stat_info")
public class StatInfo extends StatInfoKey {
    private String taskNum;

    private String address;

    private String eventDesc;

    private Integer eventSrcId;

    private String eventSrcName;

    private Integer recTypeId;

    private String recTypeName;

    private Integer eventTypeId;

    private String eventTypeName;

    private Integer mainTypeId;

    private String mainTypeName;

    private Integer subTypeId;

    private String subTypeName;

    private String eventTypeCode;

    private String partCode;

    private Integer districtId;

    private String districtName;

    private Integer streetId;

    private String streetName;

    private Integer communityId;

    private String communityName;

    private Integer cellId;

    private String cellName;

    private Integer dutyGridId;

    private String dutyGridName;

    private String dutyGridCode;

    private Integer roadId;

    private String roadName;

    private Integer roadTypeId;

    private String roadTypeName;

    private Double coordinateX;

    private Double coordinateY;

    private Integer actPropertyId;

    private Integer eventStateId;

    private String eventStateName;

    private Integer eventGradeId;

    private String eventGradeName;

    private Integer eventLevelId;

    private String eventLevelName;

    private Integer reportNum;

    private Integer validReportNum;

    private Integer patrolReportNum;

    private Integer validPatrolReportNum;

    private Integer publicReportNum;

    private Integer validPublicReportNum;

    private Integer reportPatrolId;

    private String reportPatrolName;

    private Date operateTime;

    private Integer operateRoleId;

    private Integer operateHumanId;

    private String operateHumanName;

    private Integer notOperateNum;

    private Integer toOperateNum;

    private Integer operateNum;

    private Integer intimeOperateNum;

    private Integer needSendVerifyNum;

    private Date sendVerifyTime;

    private Integer sendVerifyHumanId;

    private String sendVerifyHumanName;

    private Integer sendVerifyHumanRoleId;

    private Integer sendVerifyNum;

    private Integer intimeSendVerifyNum;

    private Integer needVerifyNum;

    private Date verifyTime;

    private Integer verifyPatrolId;

    private String verifyPatrolName;

    private Integer verifyNum;

    private Integer intimeVerifyNum;

    private Date instTime;

    private Integer instHumanId;

    private String instHumanName;

    private Integer instRoleId;

    private Integer notInstNum;

    private Integer toInstNum;

    private Integer instNum;

    private Integer intimeInstNum;

    private Integer needDispatchNum;

    private Date dispatchTime;

    private Integer dispatchHumanId;

    private String dispatchHumanName;

    private Integer dispatchRoleId;

    private Integer toDispatchNum;

    private Integer dispatchNum;

    private Integer intimeDispatchNum;

    private Float overtimeDispatchTimes;

    private Integer needSecondDispatchNum;

    private Date secondDispatchTime;

    private Integer secondDispatchHumanId;

    private String secondDispatchHumanName;

    private Integer secondDispatchRoleId;

    private Integer secondDispatchNum;

    private Integer intimeSecondDispatchNum;

    private Integer needDisposeNum;

    private Integer disposeRegionId;

    private String disposeRegionName;

    private Integer disposeUnitId;

    private String disposeUnitName;

    private Integer disposeActDefId;

    private Integer firstUnitId;

    private String firstUnitName;

    private Integer secondUnitId;

    private String secondUnitName;

    private Integer thirdUnitId;

    private String thridUnitName;

    private Date disposeBeginTime;

    private Date disposeEndTime;

    private Date disposeDeadline;

    private Date bundleDisposeDeadline;

    private Integer disposeNum;

    private Integer intimeDisposeNum;

    private Integer overtimeDisposeNum;

    private Integer toDisposeNum;

    private Integer intimeToDisposeNum;

    private Integer overtimeToDisposeNum;

    private Float disposeUsed;

    private Float disposeLimit;

    private String disposeLimitStr;

    private Float bundleDisposeUsed;

    private Float bundleDisposeLimit;

    private Float disposeOvertimeTimes;

    private Float bundleDisposeOvertimeTimes;

    private String disposeOpinion;

    private Integer postponeNum;

    private Integer reworkNum;

    private Integer multiReworkNum;

    private Integer districtReworkNum;

    private Integer multiDistrictReworkNum;

    private Integer shuffleNum;

    private Integer multiOvertimeBackNum;

    private Integer hangNum;

    private Integer hisHangNum;

    private Integer needArchiveNum;

    private Integer toArchiveNum;

    private Integer archiveNum;

    private Date archiveTime;

    private Integer overtimeArchiveNum;

    private Integer intimeArchiveNum;

    private Integer overtimeToArchiveNum;

    private Integer intimeToArchiveNum;

    private Integer needSuperviseNum;

    private Date superviseTime;

    private Integer superviseHumanId;

    private String superviseHumanName;

    private Integer superviseRoleId;

    private Integer toSuperviseNum;

    private Integer superviseNum;

    private Integer intimeSuperviseNum;

    private Integer needSendCheckNum;

    private Date sendCheckTime;

    private Integer sendCheckHumanId;

    private String sendCheckHumanName;

    private Integer sendCheckHumanRoleId;

    private Integer sendCheckNum;

    private Integer intimeSendCheckNum;

    private Integer needCheckNum;

    private Date checkTime;

    private Integer checkPatrolId;

    private String checkPatrolName;

    private Integer checkNum;

    private Integer intimeCheckNum;

    private Date checkTransTime;

    private Integer checkTransHumanId;

    private String checkTransHumanName;

    private Integer checkTransRoleId;

    private Integer checkTransNum;

    private Integer needHumanArchiveNum;

    private Date humanArchiveTime;

    private Integer archiveHumanId;

    private String archiveHumanName;

    private Integer archiveRoleId;

    private Integer humanArchiveNum;

    private Integer intimeHumanArchiveNum;

    private Integer cancelNum;

    private String cancelOpinion;

    private Date cancelTime;

    private Integer bizId;

    private String bizName;

    private Integer displayStyleId;

    private Integer periodType;

    private Integer statFlag;

    private Integer newInstCondId;

    private String newInstCondName;

    private Integer archiveCondId;

    private String archiveCondName;

    private String recDispNum;

    private Integer classicFlag;

    private Date lastUpdateTime;

    private Integer thirdTypeId;

    private String thirdTypeName;

    private Integer maxEventTypeId;

    private String maxEventTypeName;

    private String mediaUrl;

    private Integer patrolDealFlag;

    private Byte patrolDealReportNum;

    private Byte patrolDealArchiveNum;

    private Byte patrolDealCancelNum;

    private Integer toVerifyNum;

    private Integer overtimeInstNum;

    private Integer toCheckNum;

    private Integer backNum;

    private Integer curActDefId;

    private String curActDefName;

    private String roadStatName;

    private Integer multiDispatchNum;

    private Integer multiRollbackNum;

    private Date checkBeginTime;

    private Date firstSendCheckTime;

    private Date lastCheckTime;

    private String archiveTypeName;

    private String archiveOpinion;

    private String dutyRegionName;

    private String createTimeHours;

    private String createTimeDay;

    private String createTimeMonth;

    private String archiveTimeHours;

    private Integer reporterId;

    private String reporterName;

    private String contact;

    private Integer accurDispatchNum;

    private Integer wrongDispatchNum;

    @Transient
    private Integer callNums;
    @Transient
    private Integer connectCallNums;
    @Transient
    private Integer signNum;
    @Transient
    private Integer intimeSignNum;

    private String idCardNo;

    @Transient
    private Integer commonRecTypeFlag;
    @Transient
    private Integer commonRecAttrFlag;

    @Transient
    private Integer centerTownFlag;

    @Transient
    private Integer hzRoadTypeId;

    @Transient
    private Integer specTypeId;
    @Transient
    private Integer statAppendFlag;
    @Transient
    private Integer archiveHumanRoleId;
    @Transient
    private Integer dispatchHumanRoleId;
    @Transient
    private Integer secondDispatchHumanRoleId;
    @Transient
    private Integer superviseHumanRoleId;
    @Transient
    private String thirdUnitName;

    public String getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(String taskNum) {
        this.taskNum = taskNum == null ? null : taskNum.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc == null ? null : eventDesc.trim();
    }

    public Integer getEventSrcId() {
        return eventSrcId;
    }

    public void setEventSrcId(Integer eventSrcId) {
        this.eventSrcId = eventSrcId;
    }

    public String getEventSrcName() {
        return eventSrcName;
    }

    public void setEventSrcName(String eventSrcName) {
        this.eventSrcName = eventSrcName == null ? null : eventSrcName.trim();
    }

    public Integer getRecTypeId() {
        return recTypeId;
    }

    public void setRecTypeId(Integer recTypeId) {
        this.recTypeId = recTypeId;
    }

    public String getRecTypeName() {
        return recTypeName;
    }

    public void setRecTypeName(String recTypeName) {
        this.recTypeName = recTypeName == null ? null : recTypeName.trim();
    }

    public Integer getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName == null ? null : eventTypeName.trim();
    }

    public Integer getMainTypeId() {
        return mainTypeId;
    }

    public void setMainTypeId(Integer mainTypeId) {
        this.mainTypeId = mainTypeId;
    }

    public String getMainTypeName() {
        return mainTypeName;
    }

    public void setMainTypeName(String mainTypeName) {
        this.mainTypeName = mainTypeName == null ? null : mainTypeName.trim();
    }

    public Integer getSubTypeId() {
        return subTypeId;
    }

    public void setSubTypeId(Integer subTypeId) {
        this.subTypeId = subTypeId;
    }

    public String getSubTypeName() {
        return subTypeName;
    }

    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName == null ? null : subTypeName.trim();
    }

    public String getEventTypeCode() {
        return eventTypeCode;
    }

    public void setEventTypeCode(String eventTypeCode) {
        this.eventTypeCode = eventTypeCode == null ? null : eventTypeCode.trim();
    }

    public String getPartCode() {
        return partCode;
    }

    public void setPartCode(String partCode) {
        this.partCode = partCode == null ? null : partCode.trim();
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName == null ? null : streetName.trim();
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName == null ? null : communityName.trim();
    }

    public Integer getCellId() {
        return cellId;
    }

    public void setCellId(Integer cellId) {
        this.cellId = cellId;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName == null ? null : cellName.trim();
    }

    public Integer getDutyGridId() {
        return dutyGridId;
    }

    public void setDutyGridId(Integer dutyGridId) {
        this.dutyGridId = dutyGridId;
    }

    public String getDutyGridName() {
        return dutyGridName;
    }

    public void setDutyGridName(String dutyGridName) {
        this.dutyGridName = dutyGridName == null ? null : dutyGridName.trim();
    }

    public String getDutyGridCode() {
        return dutyGridCode;
    }

    public void setDutyGridCode(String dutyGridCode) {
        this.dutyGridCode = dutyGridCode == null ? null : dutyGridCode.trim();
    }

    public Integer getRoadId() {
        return roadId;
    }

    public void setRoadId(Integer roadId) {
        this.roadId = roadId;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName == null ? null : roadName.trim();
    }

    public Integer getRoadTypeId() {
        return roadTypeId;
    }

    public void setRoadTypeId(Integer roadTypeId) {
        this.roadTypeId = roadTypeId;
    }

    public String getRoadTypeName() {
        return roadTypeName;
    }

    public void setRoadTypeName(String roadTypeName) {
        this.roadTypeName = roadTypeName == null ? null : roadTypeName.trim();
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

    public Integer getActPropertyId() {
        return actPropertyId;
    }

    public void setActPropertyId(Integer actPropertyId) {
        this.actPropertyId = actPropertyId;
    }

    public Integer getEventStateId() {
        return eventStateId;
    }

    public void setEventStateId(Integer eventStateId) {
        this.eventStateId = eventStateId;
    }

    public String getEventStateName() {
        return eventStateName;
    }

    public void setEventStateName(String eventStateName) {
        this.eventStateName = eventStateName == null ? null : eventStateName.trim();
    }

    public Integer getEventGradeId() {
        return eventGradeId;
    }

    public void setEventGradeId(Integer eventGradeId) {
        this.eventGradeId = eventGradeId;
    }

    public String getEventGradeName() {
        return eventGradeName;
    }

    public void setEventGradeName(String eventGradeName) {
        this.eventGradeName = eventGradeName == null ? null : eventGradeName.trim();
    }

    public Integer getEventLevelId() {
        return eventLevelId;
    }

    public void setEventLevelId(Integer eventLevelId) {
        this.eventLevelId = eventLevelId;
    }

    public String getEventLevelName() {
        return eventLevelName;
    }

    public void setEventLevelName(String eventLevelName) {
        this.eventLevelName = eventLevelName == null ? null : eventLevelName.trim();
    }

    public Integer getReportNum() {
        return reportNum;
    }

    public void setReportNum(Integer reportNum) {
        this.reportNum = reportNum;
    }

    public Integer getValidReportNum() {
        return validReportNum;
    }

    public void setValidReportNum(Integer validReportNum) {
        this.validReportNum = validReportNum;
    }

    public Integer getPatrolReportNum() {
        return patrolReportNum;
    }

    public void setPatrolReportNum(Integer patrolReportNum) {
        this.patrolReportNum = patrolReportNum;
    }

    public Integer getValidPatrolReportNum() {
        return validPatrolReportNum;
    }

    public void setValidPatrolReportNum(Integer validPatrolReportNum) {
        this.validPatrolReportNum = validPatrolReportNum;
    }

    public Integer getPublicReportNum() {
        return publicReportNum;
    }

    public void setPublicReportNum(Integer publicReportNum) {
        this.publicReportNum = publicReportNum;
    }

    public Integer getValidPublicReportNum() {
        return validPublicReportNum;
    }

    public void setValidPublicReportNum(Integer validPublicReportNum) {
        this.validPublicReportNum = validPublicReportNum;
    }

    public Integer getReportPatrolId() {
        return reportPatrolId;
    }

    public void setReportPatrolId(Integer reportPatrolId) {
        this.reportPatrolId = reportPatrolId;
    }

    public String getReportPatrolName() {
        return reportPatrolName;
    }

    public void setReportPatrolName(String reportPatrolName) {
        this.reportPatrolName = reportPatrolName == null ? null : reportPatrolName.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public Integer getOperateRoleId() {
        return operateRoleId;
    }

    public void setOperateRoleId(Integer operateRoleId) {
        this.operateRoleId = operateRoleId;
    }

    public Integer getOperateHumanId() {
        return operateHumanId;
    }

    public void setOperateHumanId(Integer operateHumanId) {
        this.operateHumanId = operateHumanId;
    }

    public String getOperateHumanName() {
        return operateHumanName;
    }

    public void setOperateHumanName(String operateHumanName) {
        this.operateHumanName = operateHumanName == null ? null : operateHumanName.trim();
    }

    public Integer getNotOperateNum() {
        return notOperateNum;
    }

    public void setNotOperateNum(Integer notOperateNum) {
        this.notOperateNum = notOperateNum;
    }

    public Integer getToOperateNum() {
        return toOperateNum;
    }

    public void setToOperateNum(Integer toOperateNum) {
        this.toOperateNum = toOperateNum;
    }

    public Integer getOperateNum() {
        return operateNum;
    }

    public void setOperateNum(Integer operateNum) {
        this.operateNum = operateNum;
    }

    public Integer getIntimeOperateNum() {
        return intimeOperateNum;
    }

    public void setIntimeOperateNum(Integer intimeOperateNum) {
        this.intimeOperateNum = intimeOperateNum;
    }

    public Integer getNeedSendVerifyNum() {
        return needSendVerifyNum;
    }

    public void setNeedSendVerifyNum(Integer needSendVerifyNum) {
        this.needSendVerifyNum = needSendVerifyNum;
    }

    public Date getSendVerifyTime() {
        return sendVerifyTime;
    }

    public void setSendVerifyTime(Date sendVerifyTime) {
        this.sendVerifyTime = sendVerifyTime;
    }

    public Integer getSendVerifyHumanId() {
        return sendVerifyHumanId;
    }

    public void setSendVerifyHumanId(Integer sendVerifyHumanId) {
        this.sendVerifyHumanId = sendVerifyHumanId;
    }

    public String getSendVerifyHumanName() {
        return sendVerifyHumanName;
    }

    public void setSendVerifyHumanName(String sendVerifyHumanName) {
        this.sendVerifyHumanName = sendVerifyHumanName == null ? null : sendVerifyHumanName.trim();
    }

    public Integer getSendVerifyHumanRoleId() {
        return sendVerifyHumanRoleId;
    }

    public void setSendVerifyHumanRoleId(Integer sendVerifyHumanRoleId) {
        this.sendVerifyHumanRoleId = sendVerifyHumanRoleId;
    }

    public Integer getSendVerifyNum() {
        return sendVerifyNum;
    }

    public void setSendVerifyNum(Integer sendVerifyNum) {
        this.sendVerifyNum = sendVerifyNum;
    }

    public Integer getIntimeSendVerifyNum() {
        return intimeSendVerifyNum;
    }

    public void setIntimeSendVerifyNum(Integer intimeSendVerifyNum) {
        this.intimeSendVerifyNum = intimeSendVerifyNum;
    }

    public Integer getNeedVerifyNum() {
        return needVerifyNum;
    }

    public void setNeedVerifyNum(Integer needVerifyNum) {
        this.needVerifyNum = needVerifyNum;
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public Integer getVerifyPatrolId() {
        return verifyPatrolId;
    }

    public void setVerifyPatrolId(Integer verifyPatrolId) {
        this.verifyPatrolId = verifyPatrolId;
    }

    public String getVerifyPatrolName() {
        return verifyPatrolName;
    }

    public void setVerifyPatrolName(String verifyPatrolName) {
        this.verifyPatrolName = verifyPatrolName == null ? null : verifyPatrolName.trim();
    }

    public Integer getVerifyNum() {
        return verifyNum;
    }

    public void setVerifyNum(Integer verifyNum) {
        this.verifyNum = verifyNum;
    }

    public Integer getIntimeVerifyNum() {
        return intimeVerifyNum;
    }

    public void setIntimeVerifyNum(Integer intimeVerifyNum) {
        this.intimeVerifyNum = intimeVerifyNum;
    }

    public Date getInstTime() {
        return instTime;
    }

    public void setInstTime(Date instTime) {
        this.instTime = instTime;
    }

    public Integer getInstHumanId() {
        return instHumanId;
    }

    public void setInstHumanId(Integer instHumanId) {
        this.instHumanId = instHumanId;
    }

    public String getInstHumanName() {
        return instHumanName;
    }

    public void setInstHumanName(String instHumanName) {
        this.instHumanName = instHumanName == null ? null : instHumanName.trim();
    }

    public Integer getInstRoleId() {
        return instRoleId;
    }

    public void setInstRoleId(Integer instRoleId) {
        this.instRoleId = instRoleId;
    }

    public Integer getNotInstNum() {
        return notInstNum;
    }

    public void setNotInstNum(Integer notInstNum) {
        this.notInstNum = notInstNum;
    }

    public Integer getToInstNum() {
        return toInstNum;
    }

    public void setToInstNum(Integer toInstNum) {
        this.toInstNum = toInstNum;
    }

    public Integer getInstNum() {
        return instNum;
    }

    public void setInstNum(Integer instNum) {
        this.instNum = instNum;
    }

    public Integer getIntimeInstNum() {
        return intimeInstNum;
    }

    public void setIntimeInstNum(Integer intimeInstNum) {
        this.intimeInstNum = intimeInstNum;
    }

    public Integer getNeedDispatchNum() {
        return needDispatchNum;
    }

    public void setNeedDispatchNum(Integer needDispatchNum) {
        this.needDispatchNum = needDispatchNum;
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public Integer getDispatchHumanId() {
        return dispatchHumanId;
    }

    public void setDispatchHumanId(Integer dispatchHumanId) {
        this.dispatchHumanId = dispatchHumanId;
    }

    public String getDispatchHumanName() {
        return dispatchHumanName;
    }

    public void setDispatchHumanName(String dispatchHumanName) {
        this.dispatchHumanName = dispatchHumanName == null ? null : dispatchHumanName.trim();
    }

    public Integer getDispatchRoleId() {
        return dispatchRoleId;
    }

    public void setDispatchRoleId(Integer dispatchRoleId) {
        this.dispatchRoleId = dispatchRoleId;
    }

    public Integer getToDispatchNum() {
        return toDispatchNum;
    }

    public void setToDispatchNum(Integer toDispatchNum) {
        this.toDispatchNum = toDispatchNum;
    }

    public Integer getDispatchNum() {
        return dispatchNum;
    }

    public void setDispatchNum(Integer dispatchNum) {
        this.dispatchNum = dispatchNum;
    }

    public Integer getIntimeDispatchNum() {
        return intimeDispatchNum;
    }

    public void setIntimeDispatchNum(Integer intimeDispatchNum) {
        this.intimeDispatchNum = intimeDispatchNum;
    }

    public Float getOvertimeDispatchTimes() {
        return overtimeDispatchTimes;
    }

    public void setOvertimeDispatchTimes(Float overtimeDispatchTimes) {
        this.overtimeDispatchTimes = overtimeDispatchTimes;
    }

    public Integer getNeedSecondDispatchNum() {
        return needSecondDispatchNum;
    }

    public void setNeedSecondDispatchNum(Integer needSecondDispatchNum) {
        this.needSecondDispatchNum = needSecondDispatchNum;
    }

    public Date getSecondDispatchTime() {
        return secondDispatchTime;
    }

    public void setSecondDispatchTime(Date secondDispatchTime) {
        this.secondDispatchTime = secondDispatchTime;
    }

    public Integer getSecondDispatchHumanId() {
        return secondDispatchHumanId;
    }

    public void setSecondDispatchHumanId(Integer secondDispatchHumanId) {
        this.secondDispatchHumanId = secondDispatchHumanId;
    }

    public String getSecondDispatchHumanName() {
        return secondDispatchHumanName;
    }

    public void setSecondDispatchHumanName(String secondDispatchHumanName) {
        this.secondDispatchHumanName = secondDispatchHumanName == null ? null : secondDispatchHumanName.trim();
    }

    public Integer getSecondDispatchRoleId() {
        return secondDispatchRoleId;
    }

    public void setSecondDispatchRoleId(Integer secondDispatchRoleId) {
        this.secondDispatchRoleId = secondDispatchRoleId;
    }

    public Integer getSecondDispatchNum() {
        return secondDispatchNum;
    }

    public void setSecondDispatchNum(Integer secondDispatchNum) {
        this.secondDispatchNum = secondDispatchNum;
    }

    public Integer getIntimeSecondDispatchNum() {
        return intimeSecondDispatchNum;
    }

    public void setIntimeSecondDispatchNum(Integer intimeSecondDispatchNum) {
        this.intimeSecondDispatchNum = intimeSecondDispatchNum;
    }

    public Integer getNeedDisposeNum() {
        return needDisposeNum;
    }

    public void setNeedDisposeNum(Integer needDisposeNum) {
        this.needDisposeNum = needDisposeNum;
    }

    public Integer getDisposeRegionId() {
        return disposeRegionId;
    }

    public void setDisposeRegionId(Integer disposeRegionId) {
        this.disposeRegionId = disposeRegionId;
    }

    public String getDisposeRegionName() {
        return disposeRegionName;
    }

    public void setDisposeRegionName(String disposeRegionName) {
        this.disposeRegionName = disposeRegionName == null ? null : disposeRegionName.trim();
    }

    public Integer getDisposeUnitId() {
        return disposeUnitId;
    }

    public void setDisposeUnitId(Integer disposeUnitId) {
        this.disposeUnitId = disposeUnitId;
    }

    public String getDisposeUnitName() {
        return disposeUnitName;
    }

    public void setDisposeUnitName(String disposeUnitName) {
        this.disposeUnitName = disposeUnitName == null ? null : disposeUnitName.trim();
    }

    public Integer getDisposeActDefId() {
        return disposeActDefId;
    }

    public void setDisposeActDefId(Integer disposeActDefId) {
        this.disposeActDefId = disposeActDefId;
    }

    public Integer getFirstUnitId() {
        return firstUnitId;
    }

    public void setFirstUnitId(Integer firstUnitId) {
        this.firstUnitId = firstUnitId;
    }

    public String getFirstUnitName() {
        return firstUnitName;
    }

    public void setFirstUnitName(String firstUnitName) {
        this.firstUnitName = firstUnitName == null ? null : firstUnitName.trim();
    }

    public Integer getSecondUnitId() {
        return secondUnitId;
    }

    public void setSecondUnitId(Integer secondUnitId) {
        this.secondUnitId = secondUnitId;
    }

    public String getSecondUnitName() {
        return secondUnitName;
    }

    public void setSecondUnitName(String secondUnitName) {
        this.secondUnitName = secondUnitName == null ? null : secondUnitName.trim();
    }

    public Integer getThirdUnitId() {
        return thirdUnitId;
    }

    public void setThirdUnitId(Integer thirdUnitId) {
        this.thirdUnitId = thirdUnitId;
    }

    public String getThridUnitName() {
        return thridUnitName;
    }

    public void setThridUnitName(String thridUnitName) {
        this.thridUnitName = thridUnitName == null ? null : thridUnitName.trim();
    }

    public Date getDisposeBeginTime() {
        return disposeBeginTime;
    }

    public void setDisposeBeginTime(Date disposeBeginTime) {
        this.disposeBeginTime = disposeBeginTime;
    }

    public Date getDisposeEndTime() {
        return disposeEndTime;
    }

    public void setDisposeEndTime(Date disposeEndTime) {
        this.disposeEndTime = disposeEndTime;
    }

    public Date getDisposeDeadline() {
        return disposeDeadline;
    }

    public void setDisposeDeadline(Date disposeDeadline) {
        this.disposeDeadline = disposeDeadline;
    }

    public Date getBundleDisposeDeadline() {
        return bundleDisposeDeadline;
    }

    public void setBundleDisposeDeadline(Date bundleDisposeDeadline) {
        this.bundleDisposeDeadline = bundleDisposeDeadline;
    }

    public Integer getDisposeNum() {
        return disposeNum;
    }

    public void setDisposeNum(Integer disposeNum) {
        this.disposeNum = disposeNum;
    }

    public Integer getIntimeDisposeNum() {
        return intimeDisposeNum;
    }

    public void setIntimeDisposeNum(Integer intimeDisposeNum) {
        this.intimeDisposeNum = intimeDisposeNum;
    }

    public Integer getOvertimeDisposeNum() {
        return overtimeDisposeNum;
    }

    public void setOvertimeDisposeNum(Integer overtimeDisposeNum) {
        this.overtimeDisposeNum = overtimeDisposeNum;
    }

    public Integer getToDisposeNum() {
        return toDisposeNum;
    }

    public void setToDisposeNum(Integer toDisposeNum) {
        this.toDisposeNum = toDisposeNum;
    }

    public Integer getIntimeToDisposeNum() {
        return intimeToDisposeNum;
    }

    public void setIntimeToDisposeNum(Integer intimeToDisposeNum) {
        this.intimeToDisposeNum = intimeToDisposeNum;
    }

    public Integer getOvertimeToDisposeNum() {
        return overtimeToDisposeNum;
    }

    public void setOvertimeToDisposeNum(Integer overtimeToDisposeNum) {
        this.overtimeToDisposeNum = overtimeToDisposeNum;
    }

    public Float getDisposeUsed() {
        return disposeUsed;
    }

    public void setDisposeUsed(Float disposeUsed) {
        this.disposeUsed = disposeUsed;
    }

    public Float getDisposeLimit() {
        return disposeLimit;
    }

    public void setDisposeLimit(Float disposeLimit) {
        this.disposeLimit = disposeLimit;
    }

    public String getDisposeLimitStr() {
        return disposeLimitStr;
    }

    public void setDisposeLimitStr(String disposeLimitStr) {
        this.disposeLimitStr = disposeLimitStr == null ? null : disposeLimitStr.trim();
    }

    public Float getBundleDisposeUsed() {
        return bundleDisposeUsed;
    }

    public void setBundleDisposeUsed(Float bundleDisposeUsed) {
        this.bundleDisposeUsed = bundleDisposeUsed;
    }

    public Float getBundleDisposeLimit() {
        return bundleDisposeLimit;
    }

    public void setBundleDisposeLimit(Float bundleDisposeLimit) {
        this.bundleDisposeLimit = bundleDisposeLimit;
    }

    public Float getDisposeOvertimeTimes() {
        return disposeOvertimeTimes;
    }

    public void setDisposeOvertimeTimes(Float disposeOvertimeTimes) {
        this.disposeOvertimeTimes = disposeOvertimeTimes;
    }

    public Float getBundleDisposeOvertimeTimes() {
        return bundleDisposeOvertimeTimes;
    }

    public void setBundleDisposeOvertimeTimes(Float bundleDisposeOvertimeTimes) {
        this.bundleDisposeOvertimeTimes = bundleDisposeOvertimeTimes;
    }

    public String getDisposeOpinion() {
        return disposeOpinion;
    }

    public void setDisposeOpinion(String disposeOpinion) {
        this.disposeOpinion = disposeOpinion == null ? null : disposeOpinion.trim();
    }

    public Integer getPostponeNum() {
        return postponeNum;
    }

    public void setPostponeNum(Integer postponeNum) {
        this.postponeNum = postponeNum;
    }

    public Integer getReworkNum() {
        return reworkNum;
    }

    public void setReworkNum(Integer reworkNum) {
        this.reworkNum = reworkNum;
    }

    public Integer getMultiReworkNum() {
        return multiReworkNum;
    }

    public void setMultiReworkNum(Integer multiReworkNum) {
        this.multiReworkNum = multiReworkNum;
    }

    public Integer getDistrictReworkNum() {
        return districtReworkNum;
    }

    public void setDistrictReworkNum(Integer districtReworkNum) {
        this.districtReworkNum = districtReworkNum;
    }

    public Integer getMultiDistrictReworkNum() {
        return multiDistrictReworkNum;
    }

    public void setMultiDistrictReworkNum(Integer multiDistrictReworkNum) {
        this.multiDistrictReworkNum = multiDistrictReworkNum;
    }

    public Integer getShuffleNum() {
        return shuffleNum;
    }

    public void setShuffleNum(Integer shuffleNum) {
        this.shuffleNum = shuffleNum;
    }

    public Integer getMultiOvertimeBackNum() {
        return multiOvertimeBackNum;
    }

    public void setMultiOvertimeBackNum(Integer multiOvertimeBackNum) {
        this.multiOvertimeBackNum = multiOvertimeBackNum;
    }

    public Integer getHangNum() {
        return hangNum;
    }

    public void setHangNum(Integer hangNum) {
        this.hangNum = hangNum;
    }

    public Integer getHisHangNum() {
        return hisHangNum;
    }

    public void setHisHangNum(Integer hisHangNum) {
        this.hisHangNum = hisHangNum;
    }

    public Integer getNeedArchiveNum() {
        return needArchiveNum;
    }

    public void setNeedArchiveNum(Integer needArchiveNum) {
        this.needArchiveNum = needArchiveNum;
    }

    public Integer getToArchiveNum() {
        return toArchiveNum;
    }

    public void setToArchiveNum(Integer toArchiveNum) {
        this.toArchiveNum = toArchiveNum;
    }

    public Integer getArchiveNum() {
        return archiveNum;
    }

    public void setArchiveNum(Integer archiveNum) {
        this.archiveNum = archiveNum;
    }

    public Date getArchiveTime() {
        return archiveTime;
    }

    public void setArchiveTime(Date archiveTime) {
        this.archiveTime = archiveTime;
    }

    public Integer getOvertimeArchiveNum() {
        return overtimeArchiveNum;
    }

    public void setOvertimeArchiveNum(Integer overtimeArchiveNum) {
        this.overtimeArchiveNum = overtimeArchiveNum;
    }

    public Integer getIntimeArchiveNum() {
        return intimeArchiveNum;
    }

    public void setIntimeArchiveNum(Integer intimeArchiveNum) {
        this.intimeArchiveNum = intimeArchiveNum;
    }

    public Integer getOvertimeToArchiveNum() {
        return overtimeToArchiveNum;
    }

    public void setOvertimeToArchiveNum(Integer overtimeToArchiveNum) {
        this.overtimeToArchiveNum = overtimeToArchiveNum;
    }

    public Integer getIntimeToArchiveNum() {
        return intimeToArchiveNum;
    }

    public void setIntimeToArchiveNum(Integer intimeToArchiveNum) {
        this.intimeToArchiveNum = intimeToArchiveNum;
    }

    public Integer getNeedSuperviseNum() {
        return needSuperviseNum;
    }

    public void setNeedSuperviseNum(Integer needSuperviseNum) {
        this.needSuperviseNum = needSuperviseNum;
    }

    public Date getSuperviseTime() {
        return superviseTime;
    }

    public void setSuperviseTime(Date superviseTime) {
        this.superviseTime = superviseTime;
    }

    public Integer getSuperviseHumanId() {
        return superviseHumanId;
    }

    public void setSuperviseHumanId(Integer superviseHumanId) {
        this.superviseHumanId = superviseHumanId;
    }

    public String getSuperviseHumanName() {
        return superviseHumanName;
    }

    public void setSuperviseHumanName(String superviseHumanName) {
        this.superviseHumanName = superviseHumanName == null ? null : superviseHumanName.trim();
    }

    public Integer getSuperviseRoleId() {
        return superviseRoleId;
    }

    public void setSuperviseRoleId(Integer superviseRoleId) {
        this.superviseRoleId = superviseRoleId;
    }

    public Integer getToSuperviseNum() {
        return toSuperviseNum;
    }

    public void setToSuperviseNum(Integer toSuperviseNum) {
        this.toSuperviseNum = toSuperviseNum;
    }

    public Integer getSuperviseNum() {
        return superviseNum;
    }

    public void setSuperviseNum(Integer superviseNum) {
        this.superviseNum = superviseNum;
    }

    public Integer getIntimeSuperviseNum() {
        return intimeSuperviseNum;
    }

    public void setIntimeSuperviseNum(Integer intimeSuperviseNum) {
        this.intimeSuperviseNum = intimeSuperviseNum;
    }

    public Integer getNeedSendCheckNum() {
        return needSendCheckNum;
    }

    public void setNeedSendCheckNum(Integer needSendCheckNum) {
        this.needSendCheckNum = needSendCheckNum;
    }

    public Date getSendCheckTime() {
        return sendCheckTime;
    }

    public void setSendCheckTime(Date sendCheckTime) {
        this.sendCheckTime = sendCheckTime;
    }

    public Integer getSendCheckHumanId() {
        return sendCheckHumanId;
    }

    public void setSendCheckHumanId(Integer sendCheckHumanId) {
        this.sendCheckHumanId = sendCheckHumanId;
    }

    public String getSendCheckHumanName() {
        return sendCheckHumanName;
    }

    public void setSendCheckHumanName(String sendCheckHumanName) {
        this.sendCheckHumanName = sendCheckHumanName == null ? null : sendCheckHumanName.trim();
    }

    public Integer getSendCheckHumanRoleId() {
        return sendCheckHumanRoleId;
    }

    public void setSendCheckHumanRoleId(Integer sendCheckHumanRoleId) {
        this.sendCheckHumanRoleId = sendCheckHumanRoleId;
    }

    public Integer getSendCheckNum() {
        return sendCheckNum;
    }

    public void setSendCheckNum(Integer sendCheckNum) {
        this.sendCheckNum = sendCheckNum;
    }

    public Integer getIntimeSendCheckNum() {
        return intimeSendCheckNum;
    }

    public void setIntimeSendCheckNum(Integer intimeSendCheckNum) {
        this.intimeSendCheckNum = intimeSendCheckNum;
    }

    public Integer getNeedCheckNum() {
        return needCheckNum;
    }

    public void setNeedCheckNum(Integer needCheckNum) {
        this.needCheckNum = needCheckNum;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Integer getCheckPatrolId() {
        return checkPatrolId;
    }

    public void setCheckPatrolId(Integer checkPatrolId) {
        this.checkPatrolId = checkPatrolId;
    }

    public String getCheckPatrolName() {
        return checkPatrolName;
    }

    public void setCheckPatrolName(String checkPatrolName) {
        this.checkPatrolName = checkPatrolName == null ? null : checkPatrolName.trim();
    }

    public Integer getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(Integer checkNum) {
        this.checkNum = checkNum;
    }

    public Integer getIntimeCheckNum() {
        return intimeCheckNum;
    }

    public void setIntimeCheckNum(Integer intimeCheckNum) {
        this.intimeCheckNum = intimeCheckNum;
    }

    public Date getCheckTransTime() {
        return checkTransTime;
    }

    public void setCheckTransTime(Date checkTransTime) {
        this.checkTransTime = checkTransTime;
    }

    public Integer getCheckTransHumanId() {
        return checkTransHumanId;
    }

    public void setCheckTransHumanId(Integer checkTransHumanId) {
        this.checkTransHumanId = checkTransHumanId;
    }

    public String getCheckTransHumanName() {
        return checkTransHumanName;
    }

    public void setCheckTransHumanName(String checkTransHumanName) {
        this.checkTransHumanName = checkTransHumanName == null ? null : checkTransHumanName.trim();
    }

    public Integer getCheckTransRoleId() {
        return checkTransRoleId;
    }

    public void setCheckTransRoleId(Integer checkTransRoleId) {
        this.checkTransRoleId = checkTransRoleId;
    }

    public Integer getCheckTransNum() {
        return checkTransNum;
    }

    public void setCheckTransNum(Integer checkTransNum) {
        this.checkTransNum = checkTransNum;
    }

    public Integer getNeedHumanArchiveNum() {
        return needHumanArchiveNum;
    }

    public void setNeedHumanArchiveNum(Integer needHumanArchiveNum) {
        this.needHumanArchiveNum = needHumanArchiveNum;
    }

    public Date getHumanArchiveTime() {
        return humanArchiveTime;
    }

    public void setHumanArchiveTime(Date humanArchiveTime) {
        this.humanArchiveTime = humanArchiveTime;
    }

    public Integer getArchiveHumanId() {
        return archiveHumanId;
    }

    public void setArchiveHumanId(Integer archiveHumanId) {
        this.archiveHumanId = archiveHumanId;
    }

    public String getArchiveHumanName() {
        return archiveHumanName;
    }

    public void setArchiveHumanName(String archiveHumanName) {
        this.archiveHumanName = archiveHumanName == null ? null : archiveHumanName.trim();
    }

    public Integer getArchiveRoleId() {
        return archiveRoleId;
    }

    public void setArchiveRoleId(Integer archiveRoleId) {
        this.archiveRoleId = archiveRoleId;
    }

    public Integer getHumanArchiveNum() {
        return humanArchiveNum;
    }

    public void setHumanArchiveNum(Integer humanArchiveNum) {
        this.humanArchiveNum = humanArchiveNum;
    }

    public Integer getIntimeHumanArchiveNum() {
        return intimeHumanArchiveNum;
    }

    public void setIntimeHumanArchiveNum(Integer intimeHumanArchiveNum) {
        this.intimeHumanArchiveNum = intimeHumanArchiveNum;
    }

    public Integer getCancelNum() {
        return cancelNum;
    }

    public void setCancelNum(Integer cancelNum) {
        this.cancelNum = cancelNum;
    }

    public String getCancelOpinion() {
        return cancelOpinion;
    }

    public void setCancelOpinion(String cancelOpinion) {
        this.cancelOpinion = cancelOpinion == null ? null : cancelOpinion.trim();
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getBizId() {
        return bizId;
    }

    public void setBizId(Integer bizId) {
        this.bizId = bizId;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName == null ? null : bizName.trim();
    }

    public Integer getDisplayStyleId() {
        return displayStyleId;
    }

    public void setDisplayStyleId(Integer displayStyleId) {
        this.displayStyleId = displayStyleId;
    }

    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public Integer getStatFlag() {
        return statFlag;
    }

    public void setStatFlag(Integer statFlag) {
        this.statFlag = statFlag;
    }

    public Integer getNewInstCondId() {
        return newInstCondId;
    }

    public void setNewInstCondId(Integer newInstCondId) {
        this.newInstCondId = newInstCondId;
    }

    public String getNewInstCondName() {
        return newInstCondName;
    }

    public void setNewInstCondName(String newInstCondName) {
        this.newInstCondName = newInstCondName == null ? null : newInstCondName.trim();
    }

    public Integer getArchiveCondId() {
        return archiveCondId;
    }

    public void setArchiveCondId(Integer archiveCondId) {
        this.archiveCondId = archiveCondId;
    }

    public String getArchiveCondName() {
        return archiveCondName;
    }

    public void setArchiveCondName(String archiveCondName) {
        this.archiveCondName = archiveCondName == null ? null : archiveCondName.trim();
    }

    public String getRecDispNum() {
        return recDispNum;
    }

    public void setRecDispNum(String recDispNum) {
        this.recDispNum = recDispNum == null ? null : recDispNum.trim();
    }

    public Integer getClassicFlag() {
        return classicFlag;
    }

    public void setClassicFlag(Integer classicFlag) {
        this.classicFlag = classicFlag;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getThirdTypeId() {
        return thirdTypeId;
    }

    public void setThirdTypeId(Integer thirdTypeId) {
        this.thirdTypeId = thirdTypeId;
    }

    public String getThirdTypeName() {
        return thirdTypeName;
    }

    public void setThirdTypeName(String thirdTypeName) {
        this.thirdTypeName = thirdTypeName == null ? null : thirdTypeName.trim();
    }

    public Integer getMaxEventTypeId() {
        return maxEventTypeId;
    }

    public void setMaxEventTypeId(Integer maxEventTypeId) {
        this.maxEventTypeId = maxEventTypeId;
    }

    public String getMaxEventTypeName() {
        return maxEventTypeName;
    }

    public void setMaxEventTypeName(String maxEventTypeName) {
        this.maxEventTypeName = maxEventTypeName == null ? null : maxEventTypeName.trim();
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl == null ? null : mediaUrl.trim();
    }

    public Integer getPatrolDealFlag() {
        return patrolDealFlag;
    }

    public void setPatrolDealFlag(Integer patrolDealFlag) {
        this.patrolDealFlag = patrolDealFlag;
    }

    public Byte getPatrolDealReportNum() {
        return patrolDealReportNum;
    }

    public void setPatrolDealReportNum(Byte patrolDealReportNum) {
        this.patrolDealReportNum = patrolDealReportNum;
    }

    public Byte getPatrolDealArchiveNum() {
        return patrolDealArchiveNum;
    }

    public void setPatrolDealArchiveNum(Byte patrolDealArchiveNum) {
        this.patrolDealArchiveNum = patrolDealArchiveNum;
    }

    public Byte getPatrolDealCancelNum() {
        return patrolDealCancelNum;
    }

    public void setPatrolDealCancelNum(Byte patrolDealCancelNum) {
        this.patrolDealCancelNum = patrolDealCancelNum;
    }

    public Integer getToVerifyNum() {
        return toVerifyNum;
    }

    public void setToVerifyNum(Integer toVerifyNum) {
        this.toVerifyNum = toVerifyNum;
    }

    public Integer getOvertimeInstNum() {
        return overtimeInstNum;
    }

    public void setOvertimeInstNum(Integer overtimeInstNum) {
        this.overtimeInstNum = overtimeInstNum;
    }

    public Integer getToCheckNum() {
        return toCheckNum;
    }

    public void setToCheckNum(Integer toCheckNum) {
        this.toCheckNum = toCheckNum;
    }

    public Integer getBackNum() {
        return backNum;
    }

    public void setBackNum(Integer backNum) {
        this.backNum = backNum;
    }

    public Integer getCurActDefId() {
        return curActDefId;
    }

    public void setCurActDefId(Integer curActDefId) {
        this.curActDefId = curActDefId;
    }

    public String getCurActDefName() {
        return curActDefName;
    }

    public void setCurActDefName(String curActDefName) {
        this.curActDefName = curActDefName == null ? null : curActDefName.trim();
    }

    public String getRoadStatName() {
        return roadStatName;
    }

    public void setRoadStatName(String roadStatName) {
        this.roadStatName = roadStatName == null ? null : roadStatName.trim();
    }

    public Integer getMultiDispatchNum() {
        return multiDispatchNum;
    }

    public void setMultiDispatchNum(Integer multiDispatchNum) {
        this.multiDispatchNum = multiDispatchNum;
    }

    public Integer getMultiRollbackNum() {
        return multiRollbackNum;
    }

    public void setMultiRollbackNum(Integer multiRollbackNum) {
        this.multiRollbackNum = multiRollbackNum;
    }

    public Date getCheckBeginTime() {
        return checkBeginTime;
    }

    public void setCheckBeginTime(Date checkBeginTime) {
        this.checkBeginTime = checkBeginTime;
    }

    public Date getFirstSendCheckTime() {
        return firstSendCheckTime;
    }

    public void setFirstSendCheckTime(Date firstSendCheckTime) {
        this.firstSendCheckTime = firstSendCheckTime;
    }

    public Date getLastCheckTime() {
        return lastCheckTime;
    }

    public void setLastCheckTime(Date lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
    }

    public String getArchiveTypeName() {
        return archiveTypeName;
    }

    public void setArchiveTypeName(String archiveTypeName) {
        this.archiveTypeName = archiveTypeName == null ? null : archiveTypeName.trim();
    }

    public String getArchiveOpinion() {
        return archiveOpinion;
    }

    public void setArchiveOpinion(String archiveOpinion) {
        this.archiveOpinion = archiveOpinion == null ? null : archiveOpinion.trim();
    }

    public String getDutyRegionName() {
        return dutyRegionName;
    }

    public void setDutyRegionName(String dutyRegionName) {
        this.dutyRegionName = dutyRegionName == null ? null : dutyRegionName.trim();
    }

    public String getCreateTimeHours() {
        return createTimeHours;
    }

    public void setCreateTimeHours(String createTimeHours) {
        this.createTimeHours = createTimeHours == null ? null : createTimeHours.trim();
    }

    public String getCreateTimeDay() {
        return createTimeDay;
    }

    public void setCreateTimeDay(String createTimeDay) {
        this.createTimeDay = createTimeDay == null ? null : createTimeDay.trim();
    }

    public String getCreateTimeMonth() {
        return createTimeMonth;
    }

    public void setCreateTimeMonth(String createTimeMonth) {
        this.createTimeMonth = createTimeMonth == null ? null : createTimeMonth.trim();
    }

    public String getArchiveTimeHours() {
        return archiveTimeHours;
    }

    public void setArchiveTimeHours(String archiveTimeHours) {
        this.archiveTimeHours = archiveTimeHours == null ? null : archiveTimeHours.trim();
    }

    public Integer getReporterId() {
        return reporterId;
    }

    public void setReporterId(Integer reporterId) {
        this.reporterId = reporterId;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName == null ? null : reporterName.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public Integer getAccurDispatchNum() {
        return accurDispatchNum;
    }

    public void setAccurDispatchNum(Integer accurDispatchNum) {
        this.accurDispatchNum = accurDispatchNum;
    }

    public Integer getWrongDispatchNum() {
        return wrongDispatchNum;
    }

    public void setWrongDispatchNum(Integer wrongDispatchNum) {
        this.wrongDispatchNum = wrongDispatchNum;
    }

    public Integer getCallNums() {
        return callNums;
    }

    public void setCallNums(Integer callNums) {
        this.callNums = callNums;
    }

    public Integer getConnectCallNums() {
        return connectCallNums;
    }

    public void setConnectCallNums(Integer connectCallNums) {
        this.connectCallNums = connectCallNums;
    }

    public Integer getSignNum() {
        return signNum;
    }

    public void setSignNum(Integer signNum) {
        this.signNum = signNum;
    }

    public Integer getIntimeSignNum() {
        return intimeSignNum;
    }

    public void setIntimeSignNum(Integer intimeSignNum) {
        this.intimeSignNum = intimeSignNum;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    public Integer getCommonRecTypeFlag() {
        return commonRecTypeFlag;
    }

    public void setCommonRecTypeFlag(Integer commonRecTypeFlag) {
        this.commonRecTypeFlag = commonRecTypeFlag;
    }

    public Integer getCommonRecAttrFlag() {
        return commonRecAttrFlag;
    }

    public void setCommonRecAttrFlag(Integer commonRecAttrFlag) {
        this.commonRecAttrFlag = commonRecAttrFlag;
    }

    public Integer getCenterTownFlag() {
        return centerTownFlag;
    }

    public void setCenterTownFlag(Integer centerTownFlag) {
        this.centerTownFlag = centerTownFlag;
    }

    public Integer getHzRoadTypeId() {
        return hzRoadTypeId;
    }

    public void setHzRoadTypeId(Integer hzRoadTypeId) {
        this.hzRoadTypeId = hzRoadTypeId;
    }

    public Integer getSpecTypeId() {
        return specTypeId;
    }

    public void setSpecTypeId(Integer specTypeId) {
        this.specTypeId = specTypeId;
    }

    public Integer getStatAppendFlag() {
        return statAppendFlag;
    }

    public void setStatAppendFlag(Integer statAppendFlag) {
        this.statAppendFlag = statAppendFlag;
    }

    public Integer getArchiveHumanRoleId() {
        return archiveHumanRoleId;
    }

    public void setArchiveHumanRoleId(Integer archiveHumanRoleId) {
        this.archiveHumanRoleId = archiveHumanRoleId;
    }

    public Integer getDispatchHumanRoleId() {
        return dispatchHumanRoleId;
    }

    public void setDispatchHumanRoleId(Integer dispatchHumanRoleId) {
        this.dispatchHumanRoleId = dispatchHumanRoleId;
    }

    public Integer getSecondDispatchHumanRoleId() {
        return secondDispatchHumanRoleId;
    }

    public void setSecondDispatchHumanRoleId(Integer secondDispatchHumanRoleId) {
        this.secondDispatchHumanRoleId = secondDispatchHumanRoleId;
    }

    public Integer getSuperviseHumanRoleId() {
        return superviseHumanRoleId;
    }

    public void setSuperviseHumanRoleId(Integer superviseHumanRoleId) {
        this.superviseHumanRoleId = superviseHumanRoleId;
    }

    public String getThirdUnitName() {
        return thirdUnitName;
    }

    public void setThirdUnitName(String thirdUnitName) {
        this.thirdUnitName = thirdUnitName == null ? null : thirdUnitName.trim();
    }
}