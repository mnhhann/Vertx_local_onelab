package org.example.model;

/**
 * List of Master data (with similar structure)
 */
public class MasterData {
    /**
    * Type of data. See MasterDataType enum
    */
    private Short type;

    /**
    * Code stored in database
    */
    private Short code;

    /**
    * Name display on the list
    */
    private String description;

    /**
    * Code of upper level (to create a tree-like data)
    */
    private Short parentcode;

    /**
    * Code to report to the vernment
    */
    private String vtcode;

    /**
    * See ServiceAttribute enum
    */
    private Integer attribute;

    /**
    * See CommonStatus enum
    */
    private Short status;

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

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

    public Short getParentcode() {
        return parentcode;
    }

    public void setParentcode(Short parentcode) {
        this.parentcode = parentcode;
    }

    public String getVtcode() {
        return vtcode;
    }

    public void setVtcode(String vtcode) {
        this.vtcode = vtcode;
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