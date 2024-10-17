package org.example.model;

/**
 * Country list(Administrative unit)
 */
public class AuCountry {
    /**
    * Country code. ISO 3166-1 (2 character)
    */
    private String code;

    /**
    * Country Name. ISO 3166-1 (2 character)
    */
    private String name;

    /**
    * Country Name Vietnamese. ISO 3166-1 (2 character)
    */
    private String namevn;

    /**
    * Dữ liệu hệ thống?
    */
    private Boolean issystem;

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

    public String getNamevn() {
        return namevn;
    }

    public void setNamevn(String namevn) {
        this.namevn = namevn;
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