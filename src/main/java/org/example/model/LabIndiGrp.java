package org.example.model;

/**
 * Nhóm chỉ số XN
 */
public class LabIndiGrp {
    /**
    * Mã nhóm
    */
    private String code;

    /**
    * Tên nhóm chỉ số
    */
    private String name;

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

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}