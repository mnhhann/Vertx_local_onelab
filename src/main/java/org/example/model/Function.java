package org.example.model;

/**
 * System role / user privilege list
 */
public class Function {
    /**
    * Auto
    */
    private Short id;

    /**
    * Function code
    */
    private String code;

    /**
    * Function name
    */
    private String name;

    /**
    * Function description
    */
    private String description;

    /**
    * Bitwise, see UserRoleType enum (None = 0, Operator = 1, DataManager = 2, Viewer = 4, Reporter = 8 ). 
    */
    private Byte type;

    /**
    * True : system data, cannot be deleted/edited
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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