package com.jayce.pojo.tag;

public class Tag {
    private Long tagId;

    private String tagUid;

    private Boolean status;

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String getTagUid() {
        return tagUid;
    }

    public void setTagUid(String tagUid) {
        this.tagUid = tagUid == null ? null : tagUid.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}