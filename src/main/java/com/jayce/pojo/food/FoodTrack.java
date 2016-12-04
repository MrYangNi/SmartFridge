package com.jayce.pojo.food;

import java.util.Date;

public class FoodTrack {
    private Long trackId;

    private Long foodId;

    private Long processMethod;

    private Date processTime;

    private String processUnit;

    public Long getTrackId() {
        return trackId;
    }

    public void setTrackId(Long trackId) {
        this.trackId = trackId;
    }

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public Long getProcessMethod() {
        return processMethod;
    }

    public void setProcessMethod(Long processMethod) {
        this.processMethod = processMethod;
    }

    public Date getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
    }

    public String getProcessUnit() {
        return processUnit;
    }

    public void setProcessUnit(String processUnit) {
        this.processUnit = processUnit == null ? null : processUnit.trim();
    }
}