package org.example.model;

/**
 * Ward list (Administrative unit)
 */
public class AuWard {
    /**
    * AuWard code
    */
    private String code;

    /**
    * AuWard name
    */
    private String name;

    /**
    * District code
    */
    private String district;

    /**
    * Abbreviation
    */
    private String abbr;

    /**
    * Is system?
    */
    private Boolean issystem;

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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public Boolean getIssystem() {
        return issystem;
    }

    public void setIssystem(Boolean issystem) {
        this.issystem = issystem;
    }
}