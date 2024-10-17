package org.example.model;

/**
 * District list(Administrative unit)
 */
public class AuDistrict {
    /**
    * District code
    */
    private String code;

    /**
    * City code
    */
    private String city;

    /**
    * District name
    */
    private String name;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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