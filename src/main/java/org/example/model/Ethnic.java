package org.example.model;

/**
 * Dân tộc
 */
public class Ethnic {
    /**
    * Mã Dân tộc
    */
    private String code;

    /**
    * Tên
    */
    private String name;

    /**
    * Mô tả
    */
    private String description;

    /**
    * Là dữ liệu Hệ thống?
    */
    private Boolean issystem;

    /**
    * See CommonStatus enum
    */
    private Short status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIssystem() {
        return issystem;
    }

    public void setIssystem(Boolean issystem) {
        this.issystem = issystem;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}