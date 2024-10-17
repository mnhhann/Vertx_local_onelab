package org.example.model;

/**
 * City list (Administrative unit)
 */
public class AuCity {
    /**
    * City code
    */
    private String code;

    /**
    * Country code. FK to Country table
    */
    private String country;

    /**
    * City name
    */
    private String name;

    /**
    * Region or State of a city
    */
    private String region;

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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