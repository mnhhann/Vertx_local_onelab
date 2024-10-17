package org.example.model;

/**
 * Result for lab exam items
 */
public class Module {
    /**
    * Auto
    */
    private Short moduleid;

    /**
    * Function Code
    */
    private String code;

    /**
    * Function Name
    */
    private String name;

    /**
    * Is System?
    */
    private Boolean issystem;

    /**
    * Attribute Enum
    */
    private Integer attribute;

    /**
    * CommonStatus Enum
    */
    private Short status;

    public Short getModuleid() {
        return moduleid;
    }

    public void setModuleid(Short moduleid) {
        this.moduleid = moduleid;
    }

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

    public Boolean getIssystem() {
        return issystem;
    }

    public void setIssystem(Boolean issystem) {
        this.issystem = issystem;
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