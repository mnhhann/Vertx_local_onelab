package org.example.model;

/**
 * Group (of user)  list
 */
public class Group {
    /**
    * Auto
    */
    private Short id;

    /**
    * Function code
    */
    private String code;

    /**
    * Group name
    */
    private String name;

    /**
    * True : system data / cannot be deleted/edited
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

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
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