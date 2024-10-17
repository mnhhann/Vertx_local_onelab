package org.example.model;

/**
 * Dịch vụ kỹ thuật
 */
public class MedService {
    /**
    * Key
    */
    private Integer medserviceid;

    private String code;

    /**
    * FK to MedServiceType table (level1)
    */
    private Short typel1;

    /**
    * FK to MedServiceType table (level2)
    */
    private Short typel2;

    /**
    * FK to MedServiceType table (level3)
    */
    private Short typel3;

    /**
    * FK to MedServiceType table (level4)
    */
    private Short typel4;

    /**
    * Service description
    */
    private String description;

    private String unit;

    /**
    * Mapping code used when reporting to insurrance portal
    */
    private String nationalcode;

    /**
    * Thời gian giãn cách tối thiểu cho phép thực hiện lần kế tiếp (ngày)
    */
    private Short duration;

    /**
    * See ServicePrintAttrib enum
    */
    private Integer attribute;

    /**
    * See CommonStatus enum.
    */
    private Short status;

    public Integer getMedserviceid() {
        return medserviceid;
    }

    public void setMedserviceid(Integer medserviceid) {
        this.medserviceid = medserviceid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Short getTypel1() {
        return typel1;
    }

    public void setTypel1(Short typel1) {
        this.typel1 = typel1;
    }

    public Short getTypel2() {
        return typel2;
    }

    public void setTypel2(Short typel2) {
        this.typel2 = typel2;
    }

    public Short getTypel3() {
        return typel3;
    }

    public void setTypel3(Short typel3) {
        this.typel3 = typel3;
    }

    public Short getTypel4() {
        return typel4;
    }

    public void setTypel4(Short typel4) {
        this.typel4 = typel4;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNationalcode() {
        return nationalcode;
    }

    public void setNationalcode(String nationalcode) {
        this.nationalcode = nationalcode;
    }

    public Short getDuration() {
        return duration;
    }

    public void setDuration(Short duration) {
        this.duration = duration;
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