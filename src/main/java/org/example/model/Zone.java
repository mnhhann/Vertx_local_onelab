package org.example.model;

public class Zone {
    /**
    * Mã
    */
    private Short code;

    /**
    * Mô tả
    */
    private String description;

    /**
    * Loại Khu vực
    */
    private Short zonetype;

    /**
    * Thuộc tính
    */
    private Integer attribute;

    private Short status;

    public Short getCode() {
        return code;
    }

    public void setCode(Short code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getZonetype() {
        return zonetype;
    }

    public void setZonetype(Short zonetype) {
        this.zonetype = zonetype;
    }

    public Integer getAttribute() {
        return attribute;
    }

    public void setAttribute(Integer attribute) {
        this.attribute = attribute;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}