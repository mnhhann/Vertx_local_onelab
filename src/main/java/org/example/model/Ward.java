package org.example.model;

import java.math.BigDecimal;

/**
 * Ward list
 */
public class Ward {
    /**
    * WardId (auto)
    */
    private Short wardid;

    /**
    * Ward Code
    */
    private String code;

    /**
    * Ward InsCode
    */
    private String inscode;

    /**
    * Ward name
    */
    private String name;

    /**
    * Ward phone
    */
    private String phone;

    private String email;

    /**
    * Người liên lạc
    */
    private String contactby;

    /**
    * Number of medical doctors serving in this ward
    */
    private Short ndoctor;

    /**
    * Number of nursers serving in this ward
    */
    private Short nnurse;

    /**
    * Number of Technician serving in this ward
    */
    private Short ntechnician;

    /**
    * Number of beds in this ward
    */
    private Short nbed;

    private BigDecimal advamt;

    /**
    * Khu vực địa lý
    */
    private Short zone;

    /**
    * See Attribute enum
    */
    private Integer attribute;

    /**
    * See CommonStatus  enum
    */
    private Short status;

    public Short getWardid() {
        return wardid;
    }

    public void setWardid(Short wardid) {
        this.wardid = wardid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInscode() {
        return inscode;
    }

    public void setInscode(String inscode) {
        this.inscode = inscode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactby() {
        return contactby;
    }

    public void setContactby(String contactby) {
        this.contactby = contactby;
    }

    public Short getNdoctor() {
        return ndoctor;
    }

    public void setNdoctor(Short ndoctor) {
        this.ndoctor = ndoctor;
    }

    public Short getNnurse() {
        return nnurse;
    }

    public void setNnurse(Short nnurse) {
        this.nnurse = nnurse;
    }

    public Short getNtechnician() {
        return ntechnician;
    }

    public void setNtechnician(Short ntechnician) {
        this.ntechnician = ntechnician;
    }

    public Short getNbed() {
        return nbed;
    }

    public void setNbed(Short nbed) {
        this.nbed = nbed;
    }

    public BigDecimal getAdvamt() {
        return advamt;
    }

    public void setAdvamt(BigDecimal advamt) {
        this.advamt = advamt;
    }

    public Short getZone() {
        return zone;
    }

    public void setZone(Short zone) {
        this.zone = zone;
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