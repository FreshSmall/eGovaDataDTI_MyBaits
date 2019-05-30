package cn.com.egova.bean;

import java.util.Date;

public class StatInfoWithBLOBs extends StatInfo {

    private String urgentFlag;

    private String checkMsgStateId;

    public String getUrgentFlag() {
        return urgentFlag;
    }

    public void setUrgentFlag(String urgentFlag) {
        this.urgentFlag = urgentFlag == null ? null : urgentFlag.trim();
    }

    public String getCheckMsgStateId() {
        return checkMsgStateId;
    }

    public void setCheckMsgStateId(String checkMsgStateId) {
        this.checkMsgStateId = checkMsgStateId == null ? null : checkMsgStateId.trim();
    }

}