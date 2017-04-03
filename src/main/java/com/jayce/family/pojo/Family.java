package com.jayce.family.pojo;

import java.util.Date;

public class Family {
    private Long familyId;

    private String familyName;

    private String familyAddr;

    private Long createUser;

    private Date createTime;

    private Boolean status;

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public String getFamilyAddr() {
        return familyAddr;
    }

    public void setFamilyAddr(String familyAddr) {
        this.familyAddr = familyAddr == null ? null : familyAddr.trim();
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}