package org.example.model;

import java.math.BigDecimal;

public class LabExamItem {
    private Long exitemid;

    private Long labexid;

    private Integer medserviceid;

    private Short bywardunitid;

    private BigDecimal qty;

    private Integer priceid;

    private BigDecimal price;

    private BigDecimal discountratio;

    private BigDecimal amt;

    private String eqptcode;

    private Short specimentemplatecode;

    private Byte bloodtube;

    private String bloodbagcode;

    private String pdfurl;

    private Integer attribute;

    private Short status;

    public Long getExitemid() {
        return exitemid;
    }

    public void setExitemid(Long exitemid) {
        this.exitemid = exitemid;
    }

    public Long getLabexid() {
        return labexid;
    }

    public void setLabexid(Long labexid) {
        this.labexid = labexid;
    }

    public Integer getMedserviceid() {
        return medserviceid;
    }

    public void setMedserviceid(Integer medserviceid) {
        this.medserviceid = medserviceid;
    }

    public Short getBywardunitid() {
        return bywardunitid;
    }

    public void setBywardunitid(Short bywardunitid) {
        this.bywardunitid = bywardunitid;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public Integer getPriceid() {
        return priceid;
    }

    public void setPriceid(Integer priceid) {
        this.priceid = priceid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountratio() {
        return discountratio;
    }

    public void setDiscountratio(BigDecimal discountratio) {
        this.discountratio = discountratio;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getEqptcode() {
        return eqptcode;
    }

    public void setEqptcode(String eqptcode) {
        this.eqptcode = eqptcode;
    }

    public Short getSpecimentemplatecode() {
        return specimentemplatecode;
    }

    public void setSpecimentemplatecode(Short specimentemplatecode) {
        this.specimentemplatecode = specimentemplatecode;
    }

    public Byte getBloodtube() {
        return bloodtube;
    }

    public void setBloodtube(Byte bloodtube) {
        this.bloodtube = bloodtube;
    }

    public String getBloodbagcode() {
        return bloodbagcode;
    }

    public void setBloodbagcode(String bloodbagcode) {
        this.bloodbagcode = bloodbagcode;
    }

    public String getPdfurl() {
        return pdfurl;
    }

    public void setPdfurl(String pdfurl) {
        this.pdfurl = pdfurl;
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