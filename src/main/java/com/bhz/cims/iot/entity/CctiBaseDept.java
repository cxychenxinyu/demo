package com.bhz.cims.iot.entity;

import java.util.Date;

public class CctiBaseDept {
    private String bosUuid;

    private String parentUuid;

    private String deptName;

    private String deptCode;

    private String shortName;

    private String displayName;

    private Integer enableFlag;

    private String deptLevel;

    private Integer serialOrder;

    private String deptRemark;

    private String createUuid;

    private String createName;

    private Date createTime;

    private String updateUuid;

    private String updateName;

    private Date updateTime;

    public CctiBaseDept(String bosUuid, String parentUuid, String deptName, String deptCode, String shortName, String displayName, Integer enableFlag, String deptLevel, Integer serialOrder, String deptRemark, String createUuid, String createName, Date createTime, String updateUuid, String updateName, Date updateTime) {
        this.bosUuid = bosUuid;
        this.parentUuid = parentUuid;
        this.deptName = deptName;
        this.deptCode = deptCode;
        this.shortName = shortName;
        this.displayName = displayName;
        this.enableFlag = enableFlag;
        this.deptLevel = deptLevel;
        this.serialOrder = serialOrder;
        this.deptRemark = deptRemark;
        this.createUuid = createUuid;
        this.createName = createName;
        this.createTime = createTime;
        this.updateUuid = updateUuid;
        this.updateName = updateName;
        this.updateTime = updateTime;
    }

    public CctiBaseDept() {
        super();
    }

    public String getBosUuid() {
        return bosUuid;
    }

    public void setBosUuid(String bosUuid) {
        this.bosUuid = bosUuid == null ? null : bosUuid.trim();
    }

    public String getParentUuid() {
        return parentUuid;
    }

    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid == null ? null : parentUuid.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    public Integer getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(Integer enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getDeptLevel() {
        return deptLevel;
    }

    public void setDeptLevel(String deptLevel) {
        this.deptLevel = deptLevel == null ? null : deptLevel.trim();
    }

    public Integer getSerialOrder() {
        return serialOrder;
    }

    public void setSerialOrder(Integer serialOrder) {
        this.serialOrder = serialOrder;
    }

    public String getDeptRemark() {
        return deptRemark;
    }

    public void setDeptRemark(String deptRemark) {
        this.deptRemark = deptRemark == null ? null : deptRemark.trim();
    }

    public String getCreateUuid() {
        return createUuid;
    }

    public void setCreateUuid(String createUuid) {
        this.createUuid = createUuid == null ? null : createUuid.trim();
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUuid() {
        return updateUuid;
    }

    public void setUpdateUuid(String updateUuid) {
        this.updateUuid = updateUuid == null ? null : updateUuid.trim();
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}