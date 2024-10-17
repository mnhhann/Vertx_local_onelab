package org.example.model;

/**
 * Result for lab exam items
 */
public class LabExamResult {
    /**
    * Auto
    */
    private Long exrltid;

    /**
    * FK to LabExamItem table
    */
    private Long exitemid;

    /**
    * FK to MedService table
    */
    private Integer medserviceid;

    /**
    * FK to LabIndicator table
    */
    private Integer indid;

    /**
    * Indicator of lab test. For example, some indicators of blood test are "Red blood cell", "White blood cell", "Hemoglobin".
    */
    private String indname;

    /**
    * Result of lab test. For example, "White blood cell" is "4,500 to 10,000 cells/mc" is one result of blood test.
    */
    private String indvalue;

    private String measureunit;

    private String indnormalvalue;

    /**
    * The indicator value is Unusual
    */
    private Boolean isabnormal;

    private String notes;

    private String sid;

    public Long getExrltid() {
        return exrltid;
    }

    public void setExrltid(Long exrltid) {
        this.exrltid = exrltid;
    }

    public Long getExitemid() {
        return exitemid;
    }

    public void setExitemid(Long exitemid) {
        this.exitemid = exitemid;
    }

    public Integer getMedserviceid() {
        return medserviceid;
    }

    public void setMedserviceid(Integer medserviceid) {
        this.medserviceid = medserviceid;
    }

    public Integer getIndid() {
        return indid;
    }

    public void setIndid(Integer indid) {
        this.indid = indid;
    }

    public String getIndname() {
        return indname;
    }

    public void setIndname(String indname) {
        this.indname = indname;
    }

    public String getIndvalue() {
        return indvalue;
    }

    public void setIndvalue(String indvalue) {
        this.indvalue = indvalue;
    }

    public String getMeasureunit() {
        return measureunit;
    }

    public void setMeasureunit(String measureunit) {
        this.measureunit = measureunit;
    }

    public String getIndnormalvalue() {
        return indnormalvalue;
    }

    public void setIndnormalvalue(String indnormalvalue) {
        this.indnormalvalue = indnormalvalue;
    }

    public Boolean getIsabnormal() {
        return isabnormal;
    }

    public void setIsabnormal(Boolean isabnormal) {
        this.isabnormal = isabnormal;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}