package com.jayce.fridge.pojo;

public class Fridge {
    private Long fridgeId;

    private Long familyId;

    private String fridgeName;

    private String fridgeSn;

    private String fridgeSpec;

    private Boolean status;

    public Long getFridgeId() {
        return fridgeId;
    }

    public void setFridgeId(Long fridgeId) {
        this.fridgeId = fridgeId;
    }

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    public String getFridgeName() {
        return fridgeName;
    }

    public void setFridgeName(String fridgeName) {
        this.fridgeName = fridgeName == null ? null : fridgeName.trim();
    }

    public String getFridgeSn() {
        return fridgeSn;
    }

    public void setFridgeSn(String fridgeSn) {
        this.fridgeSn = fridgeSn == null ? null : fridgeSn.trim();
    }

    public String getFridgeSpec() {
        return fridgeSpec;
    }

    public void setFridgeSpec(String fridgeSpec) {
        this.fridgeSpec = fridgeSpec == null ? null : fridgeSpec.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}