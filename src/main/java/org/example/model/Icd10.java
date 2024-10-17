package org.example.model;

/**
 * Service for some treatment (ICD) may require a different insurance ratio.
 */
public class Icd10 {
    /**
    * ICD10 Code
    */
    private String code;

    /**
    * Description in Vietnamese
    */
    private String descvn;

    /**
    * Description in English
    */
    private String descen;

    /**
    * 0-Chapter, 1-Main group, 2-Sub group, 3-Node
    */
    private Byte atlevel;

    /**
    * Parent code of the item.
    */
    private String parentcode;

    /**
    * Code using in report to VN's Ministry of Health
    */
    private String reportcode;

    /**
    * Ordinal number
    */
    private Short sortid;

    /**
    * Approve to refund by National Health Insurance Agency
    */
    private Boolean claimapproval;

    /**
    * Thuộc tính
    */
    private Integer attribute;

    /**
    * See CommonStatus enum
    */
    private Short status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescvn() {
        return descvn;
    }

    public void setDescvn(String descvn) {
        this.descvn = descvn;
    }

    public String getDescen() {
        return descen;
    }

    public void setDescen(String descen) {
        this.descen = descen;
    }

    public Byte getAtlevel() {
        return atlevel;
    }

    public void setAtlevel(Byte atlevel) {
        this.atlevel = atlevel;
    }

    public String getParentcode() {
        return parentcode;
    }

    public void setParentcode(String parentcode) {
        this.parentcode = parentcode;
    }

    public String getReportcode() {
        return reportcode;
    }

    public void setReportcode(String reportcode) {
        this.reportcode = reportcode;
    }

    public Short getSortid() {
        return sortid;
    }

    public void setSortid(Short sortid) {
        this.sortid = sortid;
    }

    public Boolean getClaimapproval() {
        return claimapproval;
    }

    public void setClaimapproval(Boolean claimapproval) {
        this.claimapproval = claimapproval;
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