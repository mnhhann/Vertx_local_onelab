package org.example.model;

/**
 * The indicator list for lab test results.
 */
public class LabIndicator {
    /**
    * Auto
    */
    private Integer indid;

    private String indgrpcode;

    private String code;

    /**
    * Indicator of lab test. For example, some indicator of blood test are Red blood cell, White blood cell, Hemoglobin... See https://www.nhlbi.nih.v/health-topics/blood-tests
    */
    private String name;

    private String measureunit;

    private String valuechild;

    private String valuefemale;

    /**
    * Base indicator values of lab test
    */
    private String valuemale;

    /**
    * See CommonStatus enum
    */
    private Short status;

    public Integer getIndid() {
        return indid;
    }

    public void setIndid(Integer indid) {
        this.indid = indid;
    }

    public String getIndgrpcode() {
        return indgrpcode;
    }

    public void setIndgrpcode(String indgrpcode) {
        this.indgrpcode = indgrpcode;
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

    public String getMeasureunit() {
        return measureunit;
    }

    public void setMeasureunit(String measureunit) {
        this.measureunit = measureunit;
    }

    public String getValuechild() {
        return valuechild;
    }

    public void setValuechild(String valuechild) {
        this.valuechild = valuechild;
    }

    public String getValuefemale() {
        return valuefemale;
    }

    public void setValuefemale(String valuefemale) {
        this.valuefemale = valuefemale;
    }

    public String getValuemale() {
        return valuemale;
    }

    public void setValuemale(String valuemale) {
        this.valuemale = valuemale;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}