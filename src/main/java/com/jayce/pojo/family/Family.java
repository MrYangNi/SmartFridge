package com.jayce.pojo.family;

public class Family {
    private Long familyId;

    private String familyName;

    private String familyAddr;

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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}